package Gestionnaire;

import java.util.ArrayList;
import java.util.Scanner;

import Classe.Client;
import Classe.Voiture;
import Classe.Contrat;

public class Agence {
	
	
	private ArrayList<Client> List_clients = new ArrayList<Client>();
	private ArrayList<Voiture> List_voitures = new ArrayList<Voiture>();
	private ArrayList<Contrat> List_contrats = new ArrayList<Contrat>();
	
	
	public Client Rech_client(int cin) {
		Client cl = new Client();
		boolean trouv = false;
		for(int i =0;i<List_clients.size();i++) {
			if(List_clients.get(i).getCin()==cin) {
				trouv = true;
				cl = List_clients.get(i);
				break;
				
			}
		}
		if(trouv==true) {
			return cl;
		}
		else {
			return null;
		}
		
		
	}
	
	
	
	
	
	public void ajout_client() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le cin");
		int cin = sc.nextInt();
		
		if(Rech_client(cin)==null) {
			Client cl = new Client();
			cl.setCin(cin);
			System.out.println("donner le nom");
			String nom = sc.next();
			cl.setNom(nom);
			System.out.println("donner l'adresse");
			String adresse = sc.next();
			cl.setAdresse(adresse);
			System.out.println("donner le numero de permis");
			int permis = sc.nextInt();
			cl.setNum_permis(permis);
			System.out.println("donner le numero de telephone");
			int numero_tel = sc.nextInt();
			cl.setNum_tel(numero_tel);
			List_clients.add(cl);
			System.out.println("Client added ");
			
		}
		else {
			System.out.println("Client existe deja");
			
		}
		
		
		
	}
	
	
	
	public Client ajout_client_contrat() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le cin");
		int cin = sc.nextInt();
		
		if(Rech_client(cin)==null) {
			Client cl = new Client();
			cl.setCin(cin);
			System.out.println("donner le nom");
			String nom = sc.next();
			cl.setNom(nom);
			System.out.println("donner l'adresse");
			String adresse = sc.next();
			cl.setAdresse(adresse);
			System.out.println("donner le numero de permis");
			int permis = sc.nextInt();
			cl.setNum_permis(permis);
			System.out.println("donner le numero de telephone");
			int numero_tel = sc.nextInt();
			cl.setNum_tel(numero_tel);
			List_clients.add(cl);
			System.out.println("Client added ");
			return cl;
			
		}
		else {
			
			System.out.println("Client existe deja");
			return Rech_client(cin);
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	public Voiture Rech_voiture(String categorie) {
		Voiture vt = new Voiture();
		boolean trouv = false;
		for(int i =0;i<List_voitures.size();i++) {
			if(List_voitures.get(i).getCategorie().equals(categorie)) {
				vt = List_voitures.get(i);
				trouv = true;
				break;
			}
		}
		if(trouv ==true) {
			return vt;
			
		}
		else {
			return null;
		}
		
		
		
		
	}
	
	
	public void ajout_voiture() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner la marque");
		String marque  = sc.next();
		System.out.println("donner la categorie");
		String categorie  = sc.next();
		System.out.println("donner le nombre de chevaux");
		int nb_chev  = sc.nextInt();
		
		Voiture vt = new Voiture(marque,categorie,nb_chev);
		List_voitures.add(vt);
		System.out.println("Voiture added ");
				
		
	}
	
	
	public void ajout_contrat() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("donner le cin de client");
		int cin=sc.nextInt();
		Client new_client= new Client();
		if(Rech_client(cin)==null) {
			System.out.println("le client n'existe pas");
			new_client = ajout_client_contrat();
			
			
		}
		else {
			new_client = Rech_client(cin);
		}
		
		System.out.println("donner la categorie");
		String categorie=sc.next();
		
		if(Rech_voiture(categorie)!=null) {
			Voiture vt = Rech_voiture(categorie);
			if(vt.isDisponible()==true) {
				vt.setDisponible(false);
				System.out.println("donner la date de debut");
				String date_debut=sc.next();
				System.out.println("donner la date de fin");
				String date_fin=sc.next();
				Contrat new_contrat = new Contrat(new_client,vt,date_debut,date_fin);
				List_contrats.add(new_contrat);
				System.out.println("Contrat added successfully");
				
				
			}
			
		}
	}
	
	public void afficher_contrats() {
		System.out.println("Les contrats");
		for(int i =0;i<List_contrats.size();i++) {
			System.out.println(List_contrats.get(i).toString());
		}
	}
	
	public void afficher_voitures() {
		System.out.println("Les voitures");
		for(int i =0;i<List_voitures.size();i++) {
			System.out.println(List_voitures.get(i).toString());
		}
	}
	
	public void afficher_clients() {
		System.out.println("Les clients");
		for(int i =0;i<List_clients.size();i++) {
			System.out.println(List_clients.get(i).toString());
		}
	}
	
	
	
	
	

}
