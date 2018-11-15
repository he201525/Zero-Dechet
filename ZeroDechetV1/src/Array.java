import java.util.ArrayList;

//class pour créer un tableau de mission

public class Array {
	
	ArrayList <Mission> arrayMission = new ArrayList<Mission>();
	
	
	public Object getArrayMission(int numMission) {
		arrayMission.add("Faire en sorte que vos vieux vêtements soit réutiliser", "normal", 1, 1,"attente");
		
		return arrayMission.get(numMission);
	}
}
