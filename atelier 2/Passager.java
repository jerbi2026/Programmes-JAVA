package classes;

import java.util.Scanner;

public class Passager {
	
	private String numero_passeport;
	private String nom;
	private String email;
	private String numero;
	private String adresse;
	private char bien;
	public String getNumero_passeport() {
		return numero_passeport;
	}
	public void setNumero_passeport(String numero_passeport) {
		this.numero_passeport = numero_passeport;
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public char getBien() {
		return bien;
	}
	public void setBien(char bien) {
		this.bien = bien;
	}
	public Passager(String numero_passeport, String nom, String email, String numero, String adresse, char bien) {
		super();
		this.numero_passeport = numero_passeport;
		this.nom = nom;
		this.email = email;
		this.numero = numero;
		this.adresse = adresse;
		this.bien = bien;
	}
	@Override
	public String toString() {
		return "Passager [numero_passeport=" + numero_passeport + ", nom=" + nom + ", email=" + email + ", numero="
				+ numero + ", adresse=" + adresse + ", bien=" + bien + "]";
	}
	
	public Passager(String num_pass) {
		Scanner sc = new Scanner(System.in);
		this.numero_passeport=num_pass;
		System.out.print("donner le nom");
		this.nom=sc.next();
		
		System.out.print("donner l'email");
		this.email=sc.next();
		
		System.out.print("donner le numero de telephone");
		this.numero=sc.next();
		
		System.out.print("donner l'adresse ");
		this.adresse=sc.next();
		
		do {
			System.out.print("donner le comportement : o ou n");
			this.bien=sc.next().toLowerCase().charAt(0);
		}while(this.bien!='o' && this.bien!='n');
		
		
		
		
	}
	

}
