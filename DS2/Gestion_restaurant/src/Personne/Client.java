package Personne;

import java.util.ArrayList;
import java.util.Scanner;

import Restaurant.Gestion_plat;

import Restaurant.Plat;


public final class Client extends Personne{

	Gestion_plat gpl = new Gestion_plat();
	private ArrayList<Plat> liste_plats_client;
	private String email;
	
	
	
	
	public Client(int num_cin) {
		super(num_cin);
		Scanner sc = new Scanner(System.in);
		System.out.println("Email :");
		this.email=sc.next();
		
	}
	
	
	
	
	private String afficher_liste_plats() {
		String liste="";
		for(int i=0;i<this.liste_plats_client.size();i++) {
			liste  = liste+this.liste_plats_client.get(i).toString();
			liste= liste+"\n";
		}
		return liste;
	}
	public void ajouter_plats() {
		if (this.liste_plats_client == null) {
            this.liste_plats_client = new ArrayList<>();
        }
		Scanner sc = new Scanner(System.in);
		String nom;
		System.out.print("Le nom du plat");
		nom=sc.next();
		if(gpl.find_plat(nom)==null) {
			liste_plats_client.add(gpl.find_plat(nom));
			System.out.println("Plat ajoute");
		}
		else {
			System.out.println("Plat n'existe pas");
		}
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Client [email"+this.email+" liste plats client=" + afficher_liste_plats() + "]";
	}




	public ArrayList<Plat> getListe_plats_client() {
		return liste_plats_client;
	}




	public void setListe_plats_client(ArrayList<Plat> liste_plats_client) {
		this.liste_plats_client = liste_plats_client;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
