package model;
import java.util.ArrayList;
import java.util.Scanner;
import model.Array;

//Class qui permet d'afficher la vue de la console
public class ViewConsole {
	
	private static Scanner keyboard = new Scanner(System.in);//prendre ce qu'on écrit
	private static char response = 'y';//réponse 
	private Array slt;//prend le tableau
	
	
	/*
	 * Constructeur qui permet d'
	 */
	public ViewConsole() {
		slt = new Array();
	}
	//pour lancer la console
	public static void main(String[] args) {
		
			System.out.print("Bienvenue sur Zéro Déchet !" + "\nVoulez vous jouer ? (y/n) : ");
			response = keyboard.next().charAt(0);
		
		if(response == 'y' || response == 'Y'){
			System.out.println("Mission 1 : " + slt.getArrayMission.get(0));
		}
		
		else {
			System.out.println("A bientôt !");
		}
		
	}
}
