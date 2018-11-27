package model;

//class qui défini les différents caractéristiques d'une mission
public class Mission {
	private String contenu;//question
	private String type;//joker ou normal
	private int level;//le niveau de la mission
	private int numMiss;//dequel numéro de mission il s'agit dans le level
	private String etat;//type d'état de la mission si elle est réussi, attente ou impossible
	private 
	//private Etat etat;//etat de la mission si elle est réussi, attente ou impossible
	
	
	/*
	 * 
	 */
	public Mission(String contenu, String type, int level, int num,String etat) {
		this.contenu = contenu;
		this.type = type;
		this.level = level;
		this.numMiss = num;
		this.etat = etat;
		this.
	}
	
	public String getContenu() {
		return contenu;
	}


	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
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

	public int getNumMiss() {
		return numMiss;
	}
	
	public void setNumMiss(int numMiss) {
		this.numMiss = numMiss;
	}
	
}
