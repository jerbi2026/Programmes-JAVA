package Personne;

import java.util.ArrayList;
import java.util.Scanner;

import Restaurant.Gestion_plat;
import Services.Service;









public class Authentification {
	
	Gestion_plat gpl = new Gestion_plat();
	
	Service serv = new Service();
	
	
	
	private ArrayList<Personne> liste_utilisateurs = new ArrayList<>();
	
	public Personne chercher_personne(int cin) {
		for(int i=0;i<liste_utilisateurs.size();i++) {
			if(liste_utilisateurs.get(i).getNum_cin()==cin) {
				return liste_utilisateurs.get(i);
			}
		}
		return null;
		
	}
	
	public void ajouter_admin() {
		System.out.println("Admin ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CIN : ");
		int cin = sc.nextInt();
		if(chercher_personne(cin)==null) {
			Personne admin = new Admin(cin);
			liste_utilisateurs.add(admin);
		}
		else {
			System.out.println("CIN existe deja  ");
		}

	}
	
	public Client ajouter_client() {
		System.out.println("Client ");
		Scanner sc = new Scanner(System.in);
		Client client=null;
		System.out.println("CIN : ");
		int cin = sc.nextInt();
		if(chercher_personne(cin)==null) {
			
			client = new Client(cin);
			liste_utilisateurs.add(client);
			
			
		}
		else {
			System.out.println("CIN existe deja  ");
		}
		
		return client;
	}
	
	public Personne check_connexion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Username : ");
		String username= sc.next();
		
		System.out.println("Password : ");
		String password= sc.next();
		
		for(int i=0;i<liste_utilisateurs.size();i++) {
			if(liste_utilisateurs.get(i) instanceof Employee) {
				Employee emp = (Employee) liste_utilisateurs.get(i);
				if(emp.getNom().equals(username) && emp.getPassword().equals(password)) {
					return liste_utilisateurs.get(i);
				}
			}
			
		}
		
		return null;
		
	}
	
	
	public void afficher_clients() {
		System.out.println("Client : ");
		for(int i=0;i<liste_utilisateurs.size();i++) {
			if(liste_utilisateurs.get(i) instanceof Client) {
				System.out.println(liste_utilisateurs.get(i).toString());
			}
		}
	}
	
	public void ajouter_livreur() {
		System.out.println("Livreur ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CIN : ");
		int cin = sc.nextInt();
		if(chercher_personne(cin)==null) {
			Personne livreur = new Livreur(cin);
			liste_utilisateurs.add(livreur);
		}
		else {
			System.out.println("CIN existe deja  ");
		}

	}
	
	public void ajouter_serveur() {
		System.out.println("Serveur ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CIN : ");
		int cin = sc.nextInt();
		if(chercher_personne(cin)==null) {
			Personne Serveur = new Serveur(cin);
			liste_utilisateurs.add(Serveur);
		}
		else {
			System.out.println("CIN existe deja  ");
		}

	}
	
	public void ajouter_cuisinier() {
		System.out.println("cuisinier ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CIN : ");
		int cin = sc.nextInt();
		if(chercher_personne(cin)==null) {
			Personne Cuisinier = new Cuisinier(cin);
			liste_utilisateurs.add(Cuisinier);
		}
		else {
			System.out.println("CIN existe deja  ");
		}

	}
	
	
	
	
	public void interface_client(Personne pers) {
		int choix;
		Client p =(Client) pers;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1- consulter plats");
			System.out.println("2- choisir plat");
			System.out.println("3- commander des plats");
			System.out.println("4- payer commande ");
			
			System.out.println("5 - quitter");
			System.out.println("Votre choix : ");
			choix=sc.nextInt();
			if(choix==1) {
				gpl.consulter_plats();
			}
			if(choix==2) {
				int choix2;
				
				do {
					System.out.println("1- ajouter plats");
					System.out.println("2- quitter");
					choix2=sc.nextInt();
					if(choix2==1) {
						p.ajouter_plats();
					}
				}while(choix2!=2);
			}
			if(choix==3) {
				serv.add_commande(p.getListe_plats_client());
			}
			if(choix==4) {
				serv.payer_commande();
			}
			if(choix==5) {
				System.out.println("merci");
			}
			
			
			
		}while(choix!=5);
	}
	
	
	public void interface_serveur() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1- consulter commandes");
			System.out.println("2- consulter tables");
			System.out.println("3- reserver table");
			System.out.println("4 - quitter");
			System.out.println("Votre choix : ");
			choix=sc.nextInt();
			if(choix==1) {
				serv.consulter_commandes();
			}
			if(choix==2) {
				gpl.afficher_table();
			}
			
			if(choix==4) {
				System.out.println("merci");
			}
			if(choix==3) {
				gpl.reserver_table();
			}
			
			
		}while(choix!=4);
		
	}
	
	
	
	
	public void interface_livreur() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1- consulter etats des commandes prets");
			
			
			System.out.println("2 - quitter");
			System.out.println("Votre choix : ");
			choix=sc.nextInt();
			
			if(choix==2) {
				System.out.println("merci");
			}
			if(choix==1) {
				serv.afficher_commande_pret();
			}
			
			
			
			
		}while(choix!=2);
	}
	
	
	public void interface_admin() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1- consulter etats des commandes");
			System.out.println("2- liste avis");
			System.out.println("3- gerer les autres comptes");
			System.out.println("4- add table");
			System.out.println("5- add plat");
			
			System.out.println("6 - quitter");
			System.out.println("Votre choix : ");
			choix=sc.nextInt();
			if(choix==1) {
				serv.afficher_commandes();
			}
			if(choix==2) {
				serv.afficher_avis();
			}
			if(choix==3) {
			
			}
			
			if(choix==6) {
				System.out.println("merci");
			}
			if(choix==4) {
				gpl.addTable();
			}
			if(choix==5) {
				gpl.add_plat();
			}
			
			
		}while(choix!=6);
		
	}
	
	
	public void interface_cuisinier() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1- consulter les commandes");
			System.out.println("2- add plat");
			System.out.println("3- preparer plat");
			
			
			System.out.println("4 - quitter");
			System.out.println("Votre choix : ");
			choix=sc.nextInt();
			if(choix==1) {
				serv.afficher_commandes();
			}
			if(choix==2) {
				gpl.add_plat();
			}
			if(choix==3) {
				gpl.preparer_plat();
			}
			
			if(choix==4) {
				System.out.println("merci");
			}
			
			
			
		}while(choix!=4);
	}
	
	
	
	public void interface_internaute() {
		int choix;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1- Sign in as  client");
			System.out.println("2- Sign in as employee");
			System.out.println("3- Quitter");
			choix=sc.nextInt();
			if(choix==1) {
				Personne p=ajouter_client();
				interface_client(p);
				
			}
			if(choix==2) {
				Personne p = check_connexion();
				if(p instanceof Admin) {
					interface_admin();
				}
				if(p instanceof Serveur) {
					interface_serveur();
				}
				if(p instanceof Livreur) {
					interface_livreur();
				}
				if(p instanceof Cuisinier) {
					interface_cuisinier();
				}
				
			}
			
			if(choix==3) {
				System.out.println("Merci");
				
			}
			
			
			

			
		}while(choix!=3);
	}
	
	
	
	
	

}
