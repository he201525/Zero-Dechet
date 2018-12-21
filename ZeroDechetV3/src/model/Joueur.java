package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Cette classe implémente un joueur qui a un pseudo, un mot de passe, de l'expérience et le level du joueur.
 * Groupe 16
 * @author Sébastien Raemdonck
 * @author Aymeric Ponjée
 * @author Zita Almasy
 */

public class Joueur {
	
	private static String url = "jdbc:mysql://localhost/sys?useTimerzone=true&serverTimezone=UTC";
	private static String user = "root";
	private static String pwd = "root";
	
	private Connection myConnection = null;//pas de static car indépendante à chaque mission
	private Statement myState = null;
	private ResultSet myResult = null;
	
	private String sql = "";
	private String driver;
	
	private String pseudo;
	private String pwdUser;
	private int expUser;
	private int levelUser;
	
	
	/**
	 * Constructeur vide pour pouvoir instancier un Joueur et donc pouvoir accéder aux méthodes de la classe
	 */
	
	public Joueur() {
	}
	
	public boolean Connexion(String pseudo, String pwdUser) {
		try {
			this.driver = "com.mysql.cj.jdbc.Driver";
			this.myConnection = DriverManager.getConnection(this.url, this.user, this.pwd);
			this.myState = myConnection.createStatement();
			this.myResult = myState.executeQuery("Select * FROM user");
			
			this.pseudo = pseudo;
			
			while(this.myResult.next()) {
				if(pseudo.equals(this.myResult.getString(1)) && pwdUser.equals(this.myResult.getString(2))) {
					return true;
				}
			} 
		} 
		catch (SQLException e) {
			System.out.println("erreur connexion(compte)");
		}
		finally {
			try {
				 myState.close();
				 myConnection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
			return false;
	}
	
	/**
	 * Cette methode permet à l'utilisateur de se connecter 
	 */
	public void Identification() {
		try {
			System.out.println("0");
			this.driver = "com.mysql.cj.jdbc.Driver";
			System.out.println("1");
			this.myConnection = DriverManager.getConnection(this.url, this.user, this.pwd);
			System.out.println("2");
			this.myState = myConnection.createStatement();
			System.out.println("3");
			this.sql = "";
			this.myResult = myState.executeQuery("Select * FROM user where pseudo = '" + pseudo + "'");
			
			while(this.myResult.next()) {
				this.pwdUser = this.myResult.getString("pwd");
				this.expUser = this.myResult.getInt("expUser");
				this.levelUser = this.myResult.getInt("levelUser");
			}
		}
		catch (SQLException e) {
			System.out.println("erreur identification");
			
		}
		finally {
			try {
				 myState.close();
				 myConnection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * Cette methode permet à l'utilisateur de s'inscrire
	 */
	public boolean Register(String pseudo,String pwd) {
		try {
			
			
			this.myConnection = DriverManager.getConnection(this.url, this.user, this.pwd);
			this.myState = myConnection.createStatement();
			this.myState.executeUpdate("insert into user (pseudo, pwd) values('" + pseudo + "', '" + pwd + "');");
			
			return true;
			}
		
		catch (SQLException e) {
			System.out.println("erreur inscription" + e);
			
		}
		return false;
	}
	
	/**
	 * Cette methode permet d'ajouter de l'exp à l'utilisateur
	 */
	public void addExp(String pseudo, int exp) {
		try {
			this.driver = "com.mysql.cj.jdbc.Driver";
			this.myConnection = DriverManager.getConnection(url, user, pwd);
			this.myState = myConnection.createStatement();
			this.sql = "UPDATE user SET expUser = ? where pseudo = ?";
			PreparedStatement preparedStatement = this.myConnection.prepareStatement(sql);
			
			preparedStatement.setInt(1, exp);
			preparedStatement.setString(2, pseudo);
			
			preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println("erreur ajouter l'exp");
		}
		finally {
			try {
				 myState.close();
				 myConnection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void addMission(String mission) {
		try{
			this.driver = "com.mysql.cj.jdbc.Driver";
			this.myConnection = DriverManager.getConnection(url, user, pwd);
			this.myState = myConnection.createStatement();
			this.sql = "";
			this.myResult = myState.executeQuery("INSERT INTO addMission VALUES('" + mission +"');");
			
			 myState.close();
			 myConnection.close();
		}
		catch(SQLException e) {
			System.out.println("erreur ajouter une mission");
		}
		finally {
			try {
				 myState.close();
				 myConnection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * getters and setters
	 * @return
	 */
	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPwdUser() {
		return pwdUser;
	}

	public void setPwdUser(String pwdUser) {
		this.pwdUser = pwdUser;
	}

	public int getExpUser() {
		return expUser;
	}

	public void setExpUser(int expUser) {
		this.expUser = expUser;
	}

	
	
}
