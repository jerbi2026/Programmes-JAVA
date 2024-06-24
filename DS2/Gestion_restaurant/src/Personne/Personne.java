package Personne;

import java.util.Scanner;

public abstract class Personne {
	
	
	protected int num_cin;
	protected String nom;
	public int getNum_cin() {
		return num_cin;
	}
	public void setNum_cin(int num_cin) {
		this.num_cin = num_cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Personne(int num_cin, String nom) {
		super();
		this.num_cin = num_cin;
		this.nom = nom;
	}
	
	
	public Personne(int num_cin) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Votre nom");
		this.nom=sc.next();
		
		
	}
	@Override
	public String toString() {
		return "Personne [numero cin=" + num_cin + ", nom=" + nom + "]";
	}
	
	
	
	

}
