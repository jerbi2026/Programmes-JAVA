package Gestionnaire;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Gestionnaire gr = new Gestionnaire();
		int choix;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1- ajouter un patient");
			System.out.println("2- ajouter un rdv");
			System.out.println("3- afficher les rdv");
			System.out.println("4- afficher les patients");
			System.out.println("5- afficher les rdv d'aujourd'hui");
			System.out.println("6- quitter");
			System.out.println("Votre choix: ");
			choix= sc.nextInt();
			if(choix==1) {
				gr.ajout_patient();
			}
			if(choix==2) {
				gr.ajout_rdv();
			}
			if(choix==3) {
				gr.affiche_rdv();
			}
			if(choix==4) {
				gr.affiche_patient();
				
			}
			if(choix==5) {
				gr.afficher_rdv_ajourdhui();
			}
			if(choix==6) {
				System.out.println("merci");
			}
			
			
		}while(choix!=5);
		
		
		
		
		

	}

}
