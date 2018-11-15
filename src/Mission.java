//d�crit les diff�rents caract�ristiques d'une mission
public class Mission {
	private char contenu;//question
	private String type;//joker ou normal
	private int level;//le niveau de la mission
	private int numMiss;//dequel num�ro de mission il s'agit dans le level
	private static String etat;//type d'�tat de la mission si elle est r�ussi, attente ou impossible
	//private Etat etat;//etat de la mission si elle est r�ussi, attente ou impossible
	
	public Mission(char contenu, String type, int level, int num,String etat) {
		this.contenu = contenu;
		this.type = type;
		this.level = level;
		this.numMiss = num;
		this.etat = etat;
	}
	
	public char getContenu() {
		return contenu;
	}


	public void setContenu(char contenu) {
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
