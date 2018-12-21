package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Cette classe va permettre de définir une mission qui apparaître dans la console et la GUI.
 * Groupe 16
 * @author Sébastien Raemdonck
 * @author Aymeric Ponjée
 * @author Zita Almasy
 */

public class Mission {
	
	private static String url = "jdbc:mysql://localhost/sys?useTimerzone=true&serverTimezone=UTC";
	private static String user = "root";
	private static String pwd = "root";
	
	private Connection myConnection = null;//pas de static car indépendante à chaque mission
	private Statement myState = null;
	private ResultSet myResult = null;
	
	private String sql = "";
	private String driver;

	private String contenu;//question
	private int level;//le niveau de la mission
	private int expMission;
	private int idMission; 
	
	//private Etat etat;//etat de la mission si elle est réussi, attente ou impossible
	


	/**
	 * Ce constructeur permet de définir le niveau de la mission
	 * @param level Niveau de la mission
	 */
	
	public Mission(int level) {
		this.level = level;
		//System.out.println(this.level);
		try {
			Connexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	/**
	 * Cette méthode permet la connexion à la base de donnée pour récupérer une mission 
	 *
	 */
	public Object Connexion (){
		try {
			
			this.driver = "com.mysql.cj.jdbc.Driver";
			this.myConnection = DriverManager.getConnection(this.url, this.user, this.pwd);
			this.myState = myConnection.createStatement();
			this.sql = "";
			this.myResult = myState.executeQuery("select * from mission where idMission = " + level + " ORDER BY RAND() limit 1");
			
			
			//obliger d'utiliser un while avec la valeur du niveau pour reprendre les données de la ligne dans la DB
			while(this.myResult.next()) {
			this.contenu = this.myResult.getString("contenu");
			this.expMission = this.myResult.getInt("expMission");
			this.idMission = this.myResult.getInt("idMission");
		
			}
			
		}
		catch (SQLException e) {
			System.out.println("erreur connexion(Mission)");
		}
		
		finally {
			try {
				 myState.close();
				 myConnection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
}
	//Getter and Setter
	public int getIdMission() {
		return idMission;
	}

	public void setIdMission(int idMission) {
		this.idMission = idMission;
	}

	public int getExp() {
		return expMission;
	}

	public void setExp(int exp) {
		this.expMission = exp;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}

