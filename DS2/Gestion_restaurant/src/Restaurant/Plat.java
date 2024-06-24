package Restaurant;

import java.util.Scanner;

public abstract class Plat {
	protected String nom;
	protected double prix;
	protected boolean etat;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	public Plat(String nom, double prix, boolean etat) {
		super();
		this.nom = nom;
		this.prix = prix;
		
		this.etat = etat;
	}
	
	public Plat(String nom) {
		Scanner sc = new Scanner (System.in);
		
		this.nom=nom;
		System.out.println("prix du plat");
		this.prix=sc.nextDouble();
		this.etat=false;
	
		
	}
	
	public abstract Double calculer_prix();
	@Override
	public String toString() {
		return "Plat [nom=" + nom + ", prix=" + prix + ", etat=" + etat + "]";
	}
	
	
	
	
	
	
	

}
