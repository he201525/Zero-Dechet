package model;
import java.util.ArrayList;
import model.Mission;

//class pour créer un tableau de mission

public class Array {
	
	private ArrayList <Mission> arrayMission;
	
	/*
	 * Constructeur pour ajouter les éléments du tableau
	 */
	public Array() {
		arrayMission = new ArrayList<Mission>() ;
		arrayMission.add(new Mission("Faire en sorte que vos vieux vêtements soit réutiliser", "normal", 1, 1,"attente"));
	}

	public ArrayList<Mission> getArrayMission() {
		return arrayMission;
	}

	public void setArrayMission(ArrayList<Mission> arrayMission) {
		this.arrayMission = arrayMission;
	}
}
