package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Permet de récupérer les missions dans la DB
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
	private String type;//joker ou normal
	private int level;//le niveau de la mission
	//private int numMiss;//dequel numéro de mission il s'agit dans le level
	//private String etat;//type d'état de la mission si elle est réussi, attente ou impossible//créer liste réussi, impossible et attente
	private int expMission;
	//private Etat etat;//etat de la mission si elle est réussi, attente ou impossible
	


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
	
	//Object ??
	public Object Connexion (){
		try {
			
			this.driver = "com.mysql.cj.jdbc.Driver";
			this.myConnection = DriverManager.getConnection(url, user, pwd);
			this.myState = myConnection.createStatement();
			this.sql = "";
			this.myResult = myState.executeQuery("select * from mission where level = " + level + " ORDER BY RAND() limit 1");
			//System.out.println(this.myResult);
			
			//obliger d'utiliser un while avec la valeur du niveau pour reprendre les données de la ligne dans la DB
			while(this.myResult.next()) {
			this.contenu = this.myResult.getString("contenu");
			this.expMission = this.myResult.getInt("expMission");
			this.type= this.myResult.getString("type");
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


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}