package Classes;

import java.util.Scanner;

public class Produit {
	
	private String reference;
	private String designation;
	private float prix;
	public Produit(String reference, String designation, float prix) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", designation=" + designation + ", prix=" + prix + " DT]";
	}
	
	
	public Produit() {}
	
	public Produit(String reference) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("donner la designation");
		String designation = sc.next();
		this.designation=designation;
		
		this.reference=reference;
		System.out.println("donner le prix en dinar tunisien");
		float prix = sc.nextFloat();
		this.prix=prix;
		
		
	}

}
