package Classes;

import java.util.Scanner;

public class Client {
	
	private int cin;
	private String nom;
	private String email;
	private int numero;
	private String adresse;
	public Client(int cin, String nom, String email, int numero, String adresse) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.email = email;
		this.numero = numero;
		this.adresse = adresse;
	}
	public Client() {
		
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Client [cin=" + cin + ", nom=" + nom + ", email=" + email + ", numero=" + numero + ", adresse="
				+ adresse + "]";
	}
	
	
	public Client (int cin) {
		this.cin=cin;
		Scanner sc  = new Scanner(System.in);
		System.out.println("donner le nom");
		String nom = sc.next();
		this.nom=nom;
		
		System.out.println("donner l'email");
		String email = sc.next();
		this.email=email;
		
		System.out.println("donner l'adresse");
		String adresse = sc.next();
		this.adresse=adresse;
		
		System.out.println("donner le numero de tel");
		int numero = sc.nextInt();
		this.numero=numero;
		
	}
	
	

}
