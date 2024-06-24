package Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gestionnaire poste = new Gestionnaire();
		int choix;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1- Ajouter Colis");
			System.out.println("2- Ajouter lettre");
			System.out.println("3- Afficher les Colis");
			System.out.println("4- Afficher les lettres");
			System.out.println("5- Quitter");
			
			System.out.println("votre choix:");
			choix=sc.nextInt();
			if(choix==1) {
				poste.add_colis();
			}
			else if(choix==2) {
				poste.add_lettre();
			}
			else if(choix==3) {
				poste.afficher_colis();
			}
			else if(choix==4) {
				poste.afficher_lettres();
			}
			else if(choix==5) {
				System.out.println("Merci");
			}
			
		}while(choix!=5);
		
		
		
		

	}

}
