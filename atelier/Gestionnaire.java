package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestionnaire {
	
	private ArrayList<Client> liste_clients = new ArrayList<Client>();
	
	private ArrayList<Produit> liste_produits = new ArrayList<Produit>();
	
	private ArrayList<Commande> liste_commandes = new ArrayList<Commande>();
	
	
	public Client Rech_client(int cin) {
		for(int i=0;i<liste_clients.size();i++) {
			if(liste_clients.get(i).getCin()==cin) {
				return liste_clients.get(i);
			}
		}
		return null;
	}
	
	
	
	public void ajout_client() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("donner le cin");
		
		int cin = sc.nextInt();
		if(Rech_client(cin)==null) {
			Client new_client = new Client(cin);
			liste_clients.add(new_client);
			System.out.println("client added");
		}
		else {
			System.out.println("client existe deja ");
			System.out.println(Rech_client(cin).toString());
		}
		
	}
	
	public Produit Rech_produit(String reference) {
		for(int i=0;i<liste_produits.size();i++) {
			if(liste_produits.get(i).getReference().equals(reference)==true) {
				return liste_produits.get(i);
			}
		}
		return null;
	}
	
	public void ajout_produit() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("donner la reference");
		
		String reference = sc.next();
		
		if(Rech_produit(reference)==null) {
			Produit new_prod = new Produit(reference);
			liste_produits.add(new_prod);
			System.out.println("produit added");
		}
		else {
			System.out.println("produit existe deja");
			System.out.println(Rech_produit(reference));
		}
	}
	
	public Commande Rech_commande(String code) {
		for(int i=0;i<liste_commandes.size();i++) {
			if(liste_commandes.get(i).getCode().equals(code)==true) {
				return liste_commandes.get(i);
			}
		}
		return null;
	}
	
	public void ajout_commande() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("donner le cin de client");
		
		int cin = sc.nextInt();
		
		if(Rech_client(cin)!=null) {
			Client cl = Rech_client(cin);
			ArrayList<Produit> liste_achete = new ArrayList<Produit>();
			
			int fini;
			do {
				System.out.println("donner la reference du produit");
				
				String reference = sc.next();
				
				if(Rech_produit(reference)!=null) {
					liste_achete.add(Rech_produit(reference));
					
				}
				else {
					System.out.println("produit n'existe pas");
				}
				System.out.println("Si vous avez terminé l'ajout des produits tapez 1 sinon pour continuer tapez un nombre quelconque");
				fini=sc.nextInt();
				
				
				
			}while(fini!=1);
			
			String code;
			do {
				System.out.println("donner le code de la commande");
				code=sc.next();
			}while(Rech_commande(code)!=null);
			System.out.println("donner la date");
			String date=sc.next();
			
			String mode_paiement;
			do {
				System.out.println("donner le mode de paiement (carte ou cash ou cheque)");
				mode_paiement=sc.next();
			}while(!mode_paiement.equals("carte") && !mode_paiement.equals("cash") && !mode_paiement.equals("cheque"));
			
			Commande new_cmd = new Commande(liste_achete,cl,mode_paiement,code,date);
			liste_commandes.add(new_cmd);
			System.out.println("commmande added");
			
			
			
		}
		else {
			System.out.println("client n'existe pas ");
		}
	}
	
	public void affiche_commmandes() {
		for(int i=0;i<liste_commandes.size();i++) {
			System.out.println(liste_commandes.get(i).toString());
			
		}
	}
	
	public void affiche_commande_code() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le code");
		String code =  sc.next();
		if(Rech_commande(code)!=null) {
			float prix=0;
			for(int i =0;i<Rech_commande(code).getListe_produits_achetes().size();i++) {
				prix = prix+ Rech_commande(code).getListe_produits_achetes().get(i).getPrix();
			}
			System.out.println(Rech_commande(code).toString());
			System.out.println("le prix total "+prix);
		}
	}
	
	
	

}
