package Classes;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int choix;
		Gestionnaire gest = new  Gestionnaire();
		
		
		
		do {
			System.out.println("_______________________________________________");
			System.out.println("\nHOPITAL DE IHEC\n");
			System.out.println("_______________________________________________");
			
			System.out.println("_______________________________________________");
			
			System.out.println("1- Recherche Patient ");
			System.out.println("2- ajouter Patient ");
			System.out.println("3- Afficher les patients qui ont un groupe sanguin AB+ ");
			System.out.println("4- Ajouter ordonnace ");
			System.out.println("5- afficher le nombre d'occurence d'un medicament ");
			System.out.println("6- afficher les details d'une ordonnace ");
			System.out.println("7- quitter ");
			
			System.out.println("_______________________________________________");
			System.out.println("votre choix:");
			choix = sc.nextInt();
			System.out.println("_______________________________________________");
			
			if(choix==1) {
				int cin;
				System.out.println("donner le cin");
				cin=sc.nextInt();
				if(gest.Rech_patient(cin)!=null) {
					System.out.println(gest.Rech_patient(cin).toString());
				}
				else {
					System.out.println("Patient n'existe pas");
					
				}
				
				
			}
			
			if(choix==2) {
				gest.ajouter_patient();
			}
			if(choix==3) {
				gest.afficher_patient_ab();
			}
			
			if(choix==4) {
				gest.ajouter_ordonnance();
			}
			if(choix==5) {
				gest.afficher_occurence_medicament();
				
			}
			if(choix==6) {
				gest.afficher_ordonnance();
			}
			if(choix==7) {
				System.out.println("Merci");
			}
			

		}while(choix!=7);
	}

}
