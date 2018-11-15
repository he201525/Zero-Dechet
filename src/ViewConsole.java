import java.util.Scanner;

public class ViewConsole {
	
	private static Scanner keyboard = new Scanner(System.in);//prendre ce qu'on écrit
	private static char response = 'y';//réponse 

	public static void main(String[] args) {
		
		
			System.out.print("Bienvenue sur Zéro Déchet !" + "\nVoulez vous jouer ? (y/n) : ");
			response = keyboard.next().charAt(0);
			
			//après demander le level 
		
		if(response == 'y' || response == 'Y'){
			System.out.println("Mission 1 : " /*+ getArrayMission.get(0)*/);
		}
		
		else {
			System.out.println("Bonne Journée ! ");
		}
			
	}
}
