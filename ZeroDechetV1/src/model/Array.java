package model;
import java.util.ArrayList;
import model.Mission;

//class pour cr�er un tableau de mission

public class Array {
	
	private ArrayList <Mission> arrayMission;
	
	/*
	 * Constructeur pour ajouter les �l�ments du tableau
	 */
	public Array() {
		arrayMission = new ArrayList<Mission>() ;
		arrayMission.add(new Mission("Faire en sorte que vos vieux v�tements soit r�utiliser", "normal", 1, 1,"attente"));
	}

	public ArrayList<Mission> getArrayMission() {
		return arrayMission;
	}

	public void setArrayMission(ArrayList<Mission> arrayMission) {
		this.arrayMission = arrayMission;
	}
}
