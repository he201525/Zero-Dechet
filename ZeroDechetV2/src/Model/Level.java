package Model;

import java.util.ArrayList;

public class Level {
	private ArrayList <Mission> missions;
	
	
	public Level(int niveau) {
		this.missions = new ArrayList<Mission>();
		int i = 0;
		while(i != 3) {
			//System.out.println(i);
			Mission mission1 = new Mission(niveau);
			if (!missions.contains(mission1)) {//vérifie qui ne contient pas déjà la mission 
				missions.add(mission1);//contains fonction comme equals
				//peut renvoyer 2 fois même question
				i++;
			}
		}
		/*
		Mission joker = new Mission(niveau);
		if (!missions.contains(joker)) {//vérifie qui ne contient pas déjà la mission 
			missions.add(joker);//contains fonction comme equals
		}
		*/
	}


	public ArrayList<Mission> getMissions() {
		return missions;
	}


	public void setMissions(ArrayList<Mission> missions) {
		this.missions = missions;
	}
}
