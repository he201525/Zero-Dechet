import java.util.Scanner;

public class ViewConsole {
	
	private static Scanner keyboard = new Scanner(System.in);//prendre ce qu'on �crit
	private static char response = 'y';//r�ponse 

	public static void main(String[] args) {
		
		
			System.out.print("Bienvenue sur Z�ro D�chet !" + "\nVoulez vous jouer ? (y/n) : ");
			response = keyboard.next().charAt(0);
			
			//apr�s demander le level 
		
		if(response == 'y' || response == 'Y'){
			System.out.println("Mission 1 : " /*+ getArrayMission.get(0)*/);
		}
		
		else {
			System.out.println("Bonne Journ�e ! ");
		}
			
	}
}
