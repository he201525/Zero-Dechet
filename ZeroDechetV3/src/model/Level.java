package model;

import java.util.ArrayList;

import model.Mission;

public class Level {
	private ArrayList <Mission> missions;
	
	public Level(int niveau) {
		this.missions = new ArrayList<Mission>();
		int i = 0;
		while(i != 3) {
			Mission mission1 = new Mission(niveau);
			if (!missions.contains(mission1.getContenu())) {//v�rifie qui ne contient pas d�j� la mission 
				missions.add(mission1);//contains fonction comme equals
				//peut renvoyer 2 fois m�me question
				i++;
			}
		}
		/*
		Mission joker = new Mission(niveau);
		if (!missions.contains(joker)) {//v�rifie qui ne contient pas d�j� la mission 
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
