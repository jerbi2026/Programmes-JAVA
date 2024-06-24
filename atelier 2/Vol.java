package classes;

import java.time.LocalDate;
import java.util.Scanner;

public class Vol {
	
	private String reference;
	private String date_vol;
	
	private int heure_debut;
	private int heure_atterissage;
	private String destination;
	private String etat_vol="confirmé";
	private int nb_places;
	private float prix;
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDate_vol() {
		return date_vol;
	}
	public void setDate_vol(String date_vol) {
		this.date_vol = date_vol;
	}
	public int getHeure_debut() {
		return heure_debut;
	}
	public void setHeure_debut(int heure_debut) {
		this.heure_debut = heure_debut;
	}
	public int getHeure_atterissage() {
		return heure_atterissage;
	}
	public void setHeure_atterissage(int heure_atterissage) {
		this.heure_atterissage = heure_atterissage;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getEtat_vol() {
		return etat_vol;
	}
	public void setEtat_vol(String etat_vol) {
		this.etat_vol = etat_vol;
	}
	public int getNb_places() {
		return nb_places;
	}
	public void setNb_places(int nb_places) {
		this.nb_places = nb_places;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Vol(String reference, String date_vol, int heure_debut, int heure_atterissage, String destination,
			String etat_vol, int nb_places, float prix) {
		super();
		this.reference = reference;
		this.date_vol = date_vol;
		this.heure_debut = heure_debut;
		this.heure_atterissage = heure_atterissage;
		this.destination = destination;
		this.etat_vol = etat_vol;
		this.nb_places = nb_places;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Vol [reference=" + reference + ", date_vol=" + date_vol + ", heure_debut=" + heure_debut
				+ ", heure_atterissage=" + heure_atterissage + ", destination=" + destination + ", etat_vol=" + etat_vol
				+ ", nb_places=" + nb_places + ", prix=" + prix + "]";
	}
	
	public Vol(String reference ) {
		Scanner sc = new Scanner(System.in);
		this.reference=reference;
		System.out.println("donner la date");
		this.date_vol=sc.next();
		do {
			System.out.println("donner l'heure de depart");
			this.heure_debut=sc.nextInt();
		}while(this.heure_debut>24 || this.heure_debut<0);
		do {
			System.out.println("donner l'heure d'atterissage");
			this.heure_atterissage=sc.nextInt();
		}while(this.heure_atterissage>24 || this.heure_atterissage<0);
		System.out.println("donner la destination");
		this.destination=sc.next();
		do {
			System.out.println("donner l'etat du vol (confirmé ou annulé)");
			this.etat_vol=sc.next();
		}while(!this.etat_vol.equals("confirme") && !this.etat_vol.equals("annulé"));
		
		do {
			System.out.println("donner le nombre de places");
			this.nb_places=sc.nextInt();
		}while(this.nb_places<1);
		
		do {
			System.out.println("donner le prix du billet");
			this.prix=sc.nextFloat();
		}while(this.prix<0);
		
	}
	
}
