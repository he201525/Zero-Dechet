package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import model.Level;
import model.Mission;
import model.Joueur;

public class ViewConsole {

	private static Joueur player;//d�claration d'un joueur
	
	public ViewConsole() {
		player = new Joueur();//cr�ation de l'objet de type joueur
	}

	/**
	 * Ici nous �crivons toutes les missions a r�aliser
	 * @param args
	 * @throws Exception 
	 */

	public void mission() {
		int score = 0;//accumule exp
		int level;
		
		System.out.println("Bienvenue sur Z�ro D�chet :\n");
		identification();
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Remplis les 3 missions pour passer au niveau suivant !");
		for(level = 1; level<3; level++) {
		Level test = new Level(level);
		System.out.println("\nLevel : " + level);
		for(int i = 0; i<3; i++) {//joker i<4
			System.out.println("mission : " + test.getMissions().get(i).getContenu() + "\n(a) r�ussi" + "\n(b) pas encore fait");
			String answer = keyboardInput.nextLine();
			if(answer.equals("a")) {
				score += test.getMissions().get(i).getExp();
				System.out.println("Tu as " + score + " d'exp�rience\n");
			}
			else if(answer.equals("b")){
				i--;
				System.out.println("\nCourage ! Tu peux y arriver !");
			}
		}
		System.out.println("Bravo ! Tu as r�ussi le niveau : " + level);
		}
	}
	
	public void identification() {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Identifie toi en mettant ton speudo et ton mot de passe : ");
		String pseudo = keyboardInput.next();
		String pwd = keyboardInput.next();
		if(player.Connexion(pseudo, pwd)) {
			System.out.println("Tu es connect� !\n");
		}
		else {
			System.out.println("Connexion rat� !\n");
		}
	}
}