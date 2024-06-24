package Medicaments;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Gestionnaire gr = new Gestionnaire();
		 
		 int choix;
			Scanner sc = new Scanner(System.in);
			boolean fin = false;
			do {
				System.out.println("1- Ajouter un nouveau medicament");
				System.out.println("2- Recherche Medicament");
				System.out.println("3- Afficher les medicaments.");
				System.out.println("4- Vendre les medicaments");
				
				System.out.println("5- Quitter");
				System.out.println("Votre choix : ");
				choix= sc.nextInt();
				if(choix==1) {
					gr.ajouter_med();
				}
				else if(choix == 2) {
					String code ;
					System.out.println("donner le code (alphanumerique)");
					code=sc.next();
					Medicament md = gr.Rech_Med(code);
					if(md!=null) {
						System.out.println("Medicament "+md.toString());
					}
					else {
						System.out.println("Medicament introuvable");
					}
				}
				else if(choix==3) {
					gr.affiche_liste();
				}
				else if(choix==4) {
					gr.vente_med();
				}
				else if(choix==5) {
					System.out.println("Au revoir !");
					fin = true;
					break;
				}
				else {
					System.out.println("veuillez choisir un choix parmi la liste");
				}
				
				
				
			}while(choix!=7 || fin==true);
	}

}
