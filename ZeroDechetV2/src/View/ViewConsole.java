package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Model.Level;
import Model.Mission;

public class ViewConsole {
	
	private static String url = "jdbc:mysql://localhost/sys?useTimerzone=true&serverTimezone=UTC";
	private static String user = "root";
	private static String pwd = "root";
	
	private static Connection myConnection = null;
	private static Statement myState = null;
	private static ResultSet myResult = null;
	
	private static String sql = "";
	private static String driver;

	/**
	 * Ici nous écrivons toutes les missions a réaliser
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args){
		
		String m1 = "Faire en sorte que vos vieux vêtements soit réutiliser\n" + 
				"(a) réussi\n" + "(b) pas encore fait";
		
		String m2 = "Ne plus acheter de bouteille d’eau\n" + 
				"(a) réussi\n" + "(b) pas encore fait";
		
		String m3 = "Consommer locale\n" + 
                "(a) réussi\n" + "(b) pas encore fait";

		String m4 = "Manger de la viande 2 fois par semaine (max)\n" + 
                "(a) réussi\n" + "(b) pas encore fait";

		String m5 = "Faire un composte dans le fond de son jardin \n" +
                "(a) réussi\n" + "(b) pas encore fait";

		String m6 = "Utiliser des sac réutilisable pour aller faire tes courses\n" +
               "(a) réussi\n" + "(b) pas encore fait";

		String m7 = "Acheter en vrac (pâte, riz, graines, …) en ramenant tes propre pots (en verre)\n" + 
                "(a) réussi\n" + "(b) pas encore fait";

		String m8 = "Limiter vos achats compulsif souvent entouré de plastique\n" + 
                "(a) réussi\n" + "(b) pas encore fait";

		String m9 = "Remplacer les cotons-tiges jetables par un cure-oreille\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
        String m10 = "Acheter ses vêtement en seconde main (ex: https://unitedwardro.be/)\n" +
                "(a) réussi\n" + "(b) pas encore fait";
         
        String m11 = "Réutiliser le materielle scolaire qui fonctionne encore ou est en bonne état\n" +
                "(a) réussi\n" + "(b) pas encore fait";
         
        String m12 = "S’équiper pour des piques-niques et collation zéro déchet pour ce passer d’emballage jetable\n" +
                "(a) réussi\n" + "(b) pas encore fait";
         
        String m13 = "Acheter ses boissons en bouteilles consignées\n" +
                "(a) réussi\n" + "(b) pas encore fait";
         
        String m14 = "Appareil cassé ? On essaye de le faire réparer avant de le remplacer (ex: à un repair café)\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
		String m15 = "Préparer son café sans emballage (une cafetière italienne ou des capsules réutilisables)\n" + 
                "(a) réussi\n" + "(b) pas encore fait";

		String m16 = "Choisir des cosmétiques solides (savon en bloc, shampoing en bloc, déo, ...)" + 
                "(a) réussi\n" + "(b) pas encore fait";

		String m17 = "Trier tes déchets (normale, PMC, verre, carton, bientôt une pour le plastique)\n" +
            "(a) réussi\n" + "(b) pas encore fait";
		
		String m18 = "Demander au serveur de ne pas mettre une paille dans votre boisson et" +
            " si il l’a fait lui expliquer que cela n’était vraiment pas nécessaire." + 
            "(a) réussi\n" + "(b) pas encore fait";

		String m19 = "Prendre des douches de max 10 minutes" + 
            "(a) réussi\n" + "(b) pas encore fait";
		
		String m20 = "Eteindre la lumière à chaque fois que vous sortez d’une pièce" + 
            "(a) réussi\n" + "(b) pas encore fait";

		String m21 = "Utiliser les cycle cours ou écologique de vos appareil ménager\n" +
            "(a) réussi\n" + "(b) pas encore fait";

		String m22 = "Elaborer vos menu de la semaine à l’avance pour éviter au maximum d’acheter " +
            "des choses emballées dans du plastique." + 
            "(a) réussi\n" + "(b) pas encore fait";

		String m23 = "Ne pas accepter de flyers dans les rues, lisez-le puis rendez-le gentiment" + 
            "(a) réussi\n" + "(b) pas encore fait";

		String m24 = "Crée ton propre cellophane à l’aide de tissu en coton organic et de cire d'abeille en bloc (ex: tuto youtube) " + 
            "(a) réussi\n" + "(b) pas encore fait";
		
		String m25 = "Ne pas suivre la mode et essayer d’acheter l'essentiel (ce qui manque dans ta garde robe)\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
		String m26 = "Fait ton gommage du visage avec le café utilisé pour ton café du matin\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
		String m27 = "Trier les bouchons de liège pour le recyclage (mets-les dans un grand vase cela peut être très joli en décoration)\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
		String m28 = "Ne pas demander le ticket de caisse si cela est possible\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
		String m29 = "Utiliser des lingettes et disques démaquillants lavables\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
		String m30 = "Pour les filles, essayer/adopter la coupe menstruelle ou les serviettes hygiéniques lavables\n" +
               "(a) réussi\n" + "(b) pas encore fait";
		
		String m31 = "Utiliser des produits rechargeables (lames de rasoir, ancre de stabilo, porte mine, … )\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
		String m32 = "Nettoyer avec quelques produits d'entretien simples. (eau, savon noir ou de marseille, vinaigre blanc, bicarbonate de soude, microfibre). Ces 5 produits permettent de (presque) tout nettoyer. Écologique et économique ! Et si on les achète en vrac ou en grands conditionnements, on réduit encore plus les déchets !\n" +
                "(a) réussi\n" + "(b) pas encore fait";
		
		String m33 = "Acheter des fruits et légumes de saison\n" +
                 "(a) réussi\n" + "(b) pas encore fait";
		
		String m34 = "Faire un potager\n" +
                 "(a) réussi\n" + "(b) pas encore fait";
		
		String m35 = "Planter des graines et faire votre propre basilic, persil, thym, romarin, …\n" +
                 "(a) réussi\n" + "(b) pas encore fait";
		
		String m36 = "Mets un autocollant devant ta boite au lettre pour dire stop à la pub\n" +
                 "(a) réussi\n" + "(b) pas encore fait";
		
		String m37 = "Ne plus acheter des couverts, des gobelet et des pailles en plastique ainsi que des d’assiette en carton\n" +
                 "(a) réussi\n" + "(b) pas encore fait";
		/*
		Mission [] missions  = {
				new Mission(m1,"n",1,1,50),
				new Mission(m2,"n",1,2,100),
				new Mission(m3,"n",1,3,150),
				new Mission(m4,"n",2,1,50),
				new Mission(m5,"n",2,2,100),
				new Mission(m6,"n",2,3,150),
				new Mission(m7,"n",3,1,50),
				new Mission(m8,"n",3,2,100),
				new Mission(m9,"n",3,3,150),
				new Mission(m10,"n",4,1,50),
				new Mission(m11,"n",4,2,100),
				new Mission(m12,"n",4,3,150),
				new Mission(m13,"n",5,1,50),
				new Mission(m14,"n",5,2,100),
				new Mission(m15,"n",5,3,150),
		};
		takeTest(missions);*/
		
			//Connexion();
		
		test();
		
		
	}
	/*
	public void Connexion (){
			try {
				//Class.forName("com.mysql.jdbc.Driver");
				driver = "com.mysql.cj.jdbc.Driver";
				myConnection = DriverManager.getConnection(url, user, pwd);
				myState = myConnection.createStatement();
				sql = "";
				myResult = myState.executeQuery("select * from mission");
				
				while (myResult.next()) {
					System.out.println(myResult.getString("contenu") + " level : " + myResult.getString("level"));
				}
				myResult.close();
				myState.close();
			}
			catch (SQLException e) {
				System.out.println(e);
			}
		
	}
	*/
	/**
	 * Ici la fonction affiche successivement les 3 missions contenue dans chaque lvl et répète en cas d'erreurs
	 * @param missions
	 */
	/*
	public static void takeTest(Mission [] missions) {
		int score = 0;//accumule exp
		Scanner keyboardInput = new Scanner(System.in);
	
		for(int i = 0; i< missions.length; i++) {
			System.out.println("Level " + missions[i].getLevel());
			//System.out.println("Mission " + missions[i].getNumMiss()+ ": \n" +missions[i].getContenu());
			String answer = keyboardInput.nextLine();//prend valeur tapé au clavier
			if(answer.equals("a")) {
				score += missions[i].getExp();
				System.out.println("Tu as " + score + " d'expérience\n");
			}else if(answer.equals("b")){
				missions[i--].getContenu();
				System.out.println("Courage ! Tu peux y arriver !");
			}
		}
	}
	*/	
	
	public static void test() {
		int score = 0;//accumule exp
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Bienvenue sur Zéro Déchet :\n" + "Remplis les 3 missions pour passer au niveau suivant !");
		Level test = new Level(1);
		System.out.println("\nLevel 1 :");
		for(int i = 0; i<3; i++) {//joker i<4
			System.out.println("mission : " + test.getMissions().get(i).getContenu() + "\n(a) réussi" + "\n(b) pas encore fait");
			String answer = keyboardInput.nextLine();
			if(answer.equals("a")) {
				score += test.getMissions().get(i).getExp();
				System.out.println("Tu as " + score + " d'expérience\n");
			}else if(answer.equals("b")){
				i--;
				System.out.println("\nCourage ! Tu peux y arriver !");
			}
		}
		System.out.println("Bravo ! Tu as réussi le niveau : 1");
		
	}
}
