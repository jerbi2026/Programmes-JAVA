package Classes;

import java.util.Scanner;

public abstract class Courrier {
	
	
	protected String destination;
	protected String expediteur;
	protected double poids;
	
	public Courrier() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner la destination");
		this.destination=sc.next();
		System.out.println("donner l'expedition");
		this.expediteur=sc.next();
		System.out.println("donner le poids");
		this.poids=sc.nextDouble();
		
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getExpediteur() {
		return expediteur;
	}
	public void setExpediteur(String expediteur) {
		this.expediteur = expediteur;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public Courrier(String destination, String expediteur, double poids) {
		super();
		this.destination = destination;
		this.expediteur = expediteur;
		this.poids = poids;
	}
	@Override
	public String toString() {
		return "Courrier [destination=" + destination + ", expediteur=" + expediteur + ", poids=" + poids + "]";
	}
	
	

}
