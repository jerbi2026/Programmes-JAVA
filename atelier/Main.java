package Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int choix;
		
		Gestionnaire gst = new Gestionnaire();
		
		do {
			System.out.println("1- ajout client");
			System.out.println("2- ajout produit");
			System.out.println("3- ajout commande");
			System.out.println("4- afficher commandes");
			System.out.println("5- affiche commande par code");
			System.out.println("6- quitter");
			System.out.println("votre choix");
			choix=sc.nextInt();
			
			if(choix==1) {
				gst.ajout_client();
				
			}
			if(choix==2) {
				gst.ajout_produit();
				
			}
			if(choix==3) {
				gst.ajout_commande();
				
			}
			if(choix==4) {
				gst.affiche_commmandes();
				
			}
			if(choix==5) {
				gst.affiche_commande_code();;
				
			}
			if(choix==6) {
				System.out.println("merci");
			}
			
			
			
			
			
		}while(choix!=6);
		
		

	}

}
