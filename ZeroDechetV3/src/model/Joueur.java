package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Joueur {
	
	private static String url = "jdbc:mysql://localhost/sys?useTimerzone=true&serverTimezone=UTC";
	private static String user = "root";
	private static String pwd = "root";
	
	private Connection myConnection = null;//pas de static car indépendante à chaque mission
	private  Statement myState = null;
	private ResultSet myResult = null;
	
	private static String sql = "";
	private static String driver;
	
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
			
			while(this.myResult.next()) {
				if(pseudo.equals(this.myResult.getString(1)) && pwdUser.equals(this.myResult.getString(2))) {
					
					return true;
				}
			} 
		} 
		catch (SQLException e) {
			System.out.println("erreur connexion(compte)");
		}
			return false;
	}
	
	public void Identification() {
		try {
			
			this.driver = "com.mysql.cj.jdbc.Driver";
			this.myConnection = DriverManager.getConnection(url, user, pwd);
			this.myState = myConnection.createStatement();
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
	
	public void Register() {
try {
			
			this.driver = "com.mysql.cj.jdbc.Driver";
			this.myConnection = DriverManager.getConnection(url, user, pwd);
			this.myState = myConnection.createStatement();
			this.sql = "Select * from wheel where player = '" /*+ ViewBetAccount.getUsername().getText() + "'"*/;
			this.myResult = myState.executeQuery(sql);
			
			/*
			if(ViewBetAccount.getUsername().getText().toString().equals("")) {//si pas de champ rempli
				ViewBetAccount.getMsgError().setText("PLEASE CHOOSE A LOGIN");
			}else if(rs.next()) {//si pseudo existe déjà
				ViewBetAccount.getMsgError().setText("THIS LOGIN ALREADY EXIST");
				ViewBetAccount.getPassword().setText("");
				ViewBetAccount.getPassword1().setText("");
			} else {
				if(ViewBetAccount.getPassword().getText().toString().equals("")) {
					ViewBetAccount.getMsgError().setText("PLEASE CHOOSE A PASSWORD");
					ViewBetAccount.getPassword().setText("");
					ViewBetAccount.getPassword1().setText("");
				} else if(ViewBetAccount.getPassword().getText().toString().equals(ViewBetAccount.getPassword1().getText().toString())){
					String sql = "INSERT INTO user (pseudo, pwd) VALUES ('" + seb1 +"', '"+ pwd + "');");
					
					st.executeUpdate(sql);
					ViewBetAccount.getMsgError().setText("ACCOUNT CREATED!");
					ViewBetAccount.getPassword().setText("");
					ViewBetAccount.getPassword1().setText("");
					ViewBetAccount.getUsername().setText("");
				} else { 
					ViewBetAccount.getMsgError().setText("PASSWORD NOT CORRECT");
					ViewBetAccount.getPassword().setText("");
					ViewBetAccount.getPassword1().setText("");
				}
			}}*/
			}
		
		catch (SQLException e) {
			System.out.println("erreur inscription");
			
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