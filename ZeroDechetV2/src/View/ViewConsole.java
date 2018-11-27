package View;

import java.util.Scanner;

import Model.Mission;
import Model.Question;

public class ViewConsole {

	public static void main(String[] args) {
		
		String m1 = "Faire en sorte que vos vieux v�tements soit r�utiliser\n" + 
				"(a) r�ussi\n" + "(b) pas encore fait";
		
		String m2 = "Ne plus acheter de bouteille d�eau\n" + 
				"(a) r�ussi\n" + "(b) pas encore fait";
		
		String m3 = "Consommer locale\n" + 
                "(a) r�ussi\n" + "(b) pas encore fait";

		String m4 = "Manger de la viande 2 fois par semaine (max)\n" + 
                "(a) r�ussi\n" + "(b) pas encore fait";

		String m5 = "Faire un composte dans le fond de son jardin \n" +
                "(a) r�ussi\n" + "(b) pas encore fait";

		String m6 = "Utiliser des sac r�utilisable pour aller faire tes courses\n" +
               "(a) r�ussi\n" + "(b) pas encore fait";

		String m7 = "Acheter en vrac (p�te, riz, graines, �) en ramenant tes propre pots (en verre)\n" + 
                "(a) r�ussi\n" + "(b) pas encore fait";

		String m8 = "Limiter vos achats compulsif souvent entour� de plastique\n" + 
                "(a) r�ussi\n" + "(b) pas encore fait";

		String m9 = "Remplacer les cotons-tiges jetables par un cure-oreille\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
        String m10 = "Acheter ses v�tement en seconde main (ex: https://unitedwardro.be/)\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
         
        String m11 = "R�utiliser le materielle scolaire qui fonctionne encore ou est en bonne �tat\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
         
        String m12 = "S��quiper pour des piques-niques et collation z�ro d�chet pour ce passer d�emballage jetable\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
         
        String m13 = "Acheter ses boissons en bouteilles consign�es\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
         
        String m14 = "Appareil cass� ? On essaye de le faire r�parer avant de le remplacer (ex: � un repair caf�)\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m15 = "Pr�parer son caf� sans emballage (une cafeti�re italienne ou des capsules r�utilisables)\n" + 
                "(a) r�ussi\n" + "(b) pas encore fait";

		String m16 = "Choisir des cosm�tiques solides (savon en bloc, shampoing en bloc, d�o, ...)" + 
                "(a) r�ussi\n" + "(b) pas encore fait";

		String m17 = "Trier tes d�chets (normale, PMC, verre, carton, bient�t une pour le plastique)\n" +
            "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m18 = "Demander au serveur de ne pas mettre une paille dans votre boisson et" +
            " si il l�a fait lui expliquer que cela n��tait vraiment pas n�cessaire." + 
            "(a) r�ussi\n" + "(b) pas encore fait";

		String m19 = "Prendre des douches de max 10 minutes" + 
            "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m20 = "Eteindre la lumi�re � chaque fois que vous sortez d�une pi�ce" + 
            "(a) r�ussi\n" + "(b) pas encore fait";

		String m21 = "Utiliser les cycle cours ou �cologique de vos appareil m�nager\n" +
            "(a) r�ussi\n" + "(b) pas encore fait";

		String m22 = "Elaborer vos menu de la semaine � l�avance pour �viter au maximum d�acheter " +
            "des choses emball�es dans du plastique." + 
            "(a) r�ussi\n" + "(b) pas encore fait";

		String m23 = "Ne pas accepter de flyers dans les rues, lisez-le puis rendez-le gentiment" + 
            "(a) r�ussi\n" + "(b) pas encore fait";

		String m24 = "Cr�e ton propre cellophane � l�aide de tissu en coton organic et de cire d'abeille en bloc (ex: tuto youtube) " + 
            "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m25 = "Ne pas suivre la mode et essayer d�acheter l'essentiel (ce qui manque dans ta garde robe)\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m26 = "Fait ton gommage du visage avec le caf� utilis� pour ton caf� du matin\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m27 = "Trier les bouchons de li�ge pour le recyclage (mets-les dans un grand vase cela peut �tre tr�s joli en d�coration)\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m28 = "Ne pas demander le ticket de caisse si cela est possible\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m29 = "Utiliser des lingettes et disques d�maquillants lavables\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m30 = "Pour les filles, essayer/adopter la coupe menstruelle ou les serviettes hygi�niques lavables\n" +
               "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m31 = "Utiliser des produits rechargeables (lames de rasoir, ancre de stabilo, porte mine, � )\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m32 = "Nettoyer avec quelques produits d'entretien simples. (eau, savon noir ou de marseille, vinaigre blanc, bicarbonate de soude, microfibre). Ces 5 produits permettent de (presque) tout nettoyer. �cologique et �conomique ! Et si on les ach�te en vrac ou en grands conditionnements, on r�duit encore plus les d�chets !\n" +
                "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m33 = "Acheter des fruits et l�gumes de saison\n" +
                 "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m34 = "Faire un potager\n" +
                 "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m35 = "Planter des graines et faire votre propre basilic, persil, thym, romarin, �\n" +
                 "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m36 = "Mets un autocollant devant ta boite au lettre pour dire stop � la pub\n" +
                 "(a) r�ussi\n" + "(b) pas encore fait";
		
		String m37 = "Ne plus acheter des couverts, des gobelet et des pailles en plastique ainsi que des d�assiette en carton\n" +
                 "(a) r�ussi\n" + "(b) pas encore fait";
		
		//Mission a = new Mission(m1,"n",1,1);

		Mission [] missions  = {
				new Mission(m1,"n",1,1,50),
				new Mission(m2,"n",1,2,100),
				new Mission(m3,"n",1,3,150)
		};
		takeTest(missions);
		
	}	
	
	public static void takeTest(Mission [] missions) {
		int score = 0;//accumule exp
		Scanner keyboardInput = new Scanner(System.in);
		for(int i = 0; i< missions.length; i++) {
			System.out.println(missions[i].getContenu());
			String answer = keyboardInput.nextLine();//prend valeur tap� au clavier
			if(answer.equals("a")) {
				score += missions[i].getExp();
				//joueur.setExp(mission[i].getXp());
				System.out.println("Tu as " + score + " d'exp�rience");
			}
		}
	}
}
