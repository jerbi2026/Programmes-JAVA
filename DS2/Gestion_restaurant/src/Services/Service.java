package Services;

import java.util.ArrayList;
import java.util.Scanner;

import Restaurant.Gestion_plat;
import Restaurant.Plat;
import Restaurant.Table;

public class Service {
	
	
	private ArrayList<Commande> liste_commandes = new ArrayList<Commande>();
	Gestion_plat gpl = new Gestion_plat();
	private ArrayList <Avis> List_av=new ArrayList<Avis>();
	
	
	public Commande find_commande(int id) {
		for(int i=0;i<liste_commandes.size();i++) {
			if(liste_commandes.get(i).getId()==id) {
				return liste_commandes.get(i);
			}
		}
		
		return null;
	}
	
	
	
	public void payer_commande() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID de la commande ");
		int id = sc.nextInt();
		if(find_commande(id)!=null) {
			System.out.println("prix de la commande "+find_commande(id).calculer_total_prix());
			int choix;
			do {
				System.out.println("Payer la commande 1 si oui 0 sinon ");
				choix=sc.nextInt();
			}while(choix!=1 && choix!=0);
		}
		else {
			System.out.println("Commande n'existe pas  ");
		}
		
		
	}
	
	public void afficher_commandes() {
		System.out.println("Liste des Commandes  ");
		for(int i =0;i<liste_commandes.size();i++) {
			System.out.println(liste_commandes.get(i).toString());
		}
	}
	
	public void afficher_commandes_non_payees() {
		System.out.println("Liste des Commandes non payes  ");
		for(int i =0;i<liste_commandes.size();i++) {
			if(liste_commandes.get(i).isEtatPaye()==false) {
				System.out.println(liste_commandes.get(i).toString());
			}
			
		}
	}
	
	public void afficher_commandes_payees() {
		System.out.println("Liste des Commandes  payes  ");
		for(int i =0;i<liste_commandes.size();i++) {
			if(liste_commandes.get(i).isEtatPaye()==true) {
				System.out.println(liste_commandes.get(i).toString());
			}
			
		}
	}
	
	
	public void consulter_commandes() {
		Scanner sc = new Scanner(System.in);
		int choix;
		do {
			System.out.print("La liste des commandes");
			System.out.print("1- tous les commandes ");
			System.out.print("2- commandes payees");
			System.out.print("3- commandes non payees ");
			
			System.out.print("4- Quitter");
			System.out.print("Choix: ");
			choix=sc.nextInt();
			if(choix==1) {
				afficher_commandes();
			}
			if(choix==2) {
				afficher_commandes_non_payees();
			}
			if(choix==3) {
				afficher_commandes_payees();
			}
			
			if(choix==4) {
				System.out.print("Merci");
			}
			
		}while(choix!=4);
		
	}
	
	public void add_commande(ArrayList<Plat> liste_clients) {
		Scanner sc = new Scanner(System.in);
		String id1;
		do {
			System.out.println("ID du table");
			
			id1 =  sc.next();
		}while(gpl.findAppropriateTable(id1)==null);
		int id_comm;
		if(liste_commandes.size()==0) {
			id_comm=1;
		}
		else {
			id_comm = liste_commandes.get(liste_commandes.size()-1).getId()+1;
		}
		
		Commande comd = new Commande(id_comm,liste_clients,gpl.findAppropriateTable(id1));
		
	}
	
	public void ajout_avis() {
		int notes;
		int notep;
		Avis av = new Avis();
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le nom: ");
		av.setNom(sc.next());
		System.out.println("donner l'email: ");
		av.setEmail(sc.next());
		System.out.println("noter le service sur 10: ");
		notes=sc.nextInt();
		while (0>notes || notes>10) {
			System.out.println("noter le service sur 10 svp: ");
			notes=sc.nextInt();
		}
		av.setNoteService(notes);
		List_av.add(av);
		System.out.println("noter le plat sur 10: ");
		notep=sc.nextInt();
		while (0>notep || notep>10) {
			System.out.println("noter le plat sur 10 svp: ");
			notep=sc.nextInt();
		}
		av.setNotePlat(notep);
		List_av.add(av);
		System.out.println("Avis added");
		
	}
	
	
	public void afficher_avis() {
		System.out.println("Avis liste");
		for(int i=0;i<List_av.size();i++) {
			System.out.println(List_av.get(i).toString());
		}
	}
	
	
	public void afficher_commande_pret() {
		System.out.println("Liste des Commandes  prets  ");
		for(int i =0;i<liste_commandes.size();i++) {
			for(int j=0;j<liste_commandes.get(i).getOrderItems().size();j++) {
				if(liste_commandes.get(i).getOrderItems().get(j).isEtat()==true) {
					System.out.println(liste_commandes.get(i).getOrderItems().get(j).toString());
				}
				
			}
			
		}
	}

	
	
	
	

}
