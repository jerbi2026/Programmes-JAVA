package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		Gestionnaire_compagnie gst = new Gestionnaire_compagnie();
		
		int choix;
		do {
			System.out.println("1- ajout le passager");
			System.out.println("2- ajout vol");
			System.out.println("3- ajout reservation");
			System.out.println("4- afficher chiffre affaire d'une vol");
			System.out.println("5- afficher les passagers d'une vol");
			System.out.println("6-quitter");
			System.out.println("votre choix: ");
			choix=sc.nextInt();
			if(choix==1) {
				gst.ajout_passager();
			}
			if(choix==2) {
				gst.ajout_vol();
			}
			if(choix==3) {
				gst.ajout_reservation();
				gst.afficher_reserv();
			}
			if(choix==4) {
				gst.afficher_chiffre_affaire_vol();
			}
			if(choix==5) {
				gst.afficher_passager_vol();
			}
			if(choix==6) {
				System.out.println("merci");
			}
		}while(choix!=6);
	}

}
