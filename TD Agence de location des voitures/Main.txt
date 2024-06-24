package Main;

import java.util.Scanner;

import Gestionnaire.Agence;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int choix;
		Agence ag = new Agence();
		
		do {
			System.out.println("_______________________________________________");
			System.out.println("\nAgence de location des voitures\n");
			System.out.println("_______________________________________________");
			
			System.out.println("_______________________________________________");
			
			System.out.println("1- ajouter un client ");
			System.out.println("2- ajouter une voiture ");
			System.out.println("3- ajouter un contrat ");
			System.out.println("4- afficher les clients ");
			System.out.println("5- afficher les voitures ");
			System.out.println("6- afficher les contrats ");
			System.out.println("7- quitter ");
			
			System.out.println("_______________________________________________");
			System.out.println("votre choix:");
			choix= sc.nextInt();
			System.out.println("_______________________________________________");
			if(choix==1) {
				ag.ajout_client();
			}
			if(choix==2) {
				ag.ajout_voiture();
			}
			if(choix==3) {
				ag.ajout_contrat();
			}
			if(choix==4) {
				ag.afficher_clients();
			}
			if(choix==5) {
				ag.afficher_voitures();
			}
			if(choix==6) {
				ag.afficher_contrats();
			}
			if(choix==7) {
				System.out.println("merci");
			}
			
			
			
			
			
		}while(choix!=7);
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
