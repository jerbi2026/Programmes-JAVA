package Medicaments;

import java.util.Scanner;

public class Medicament {
	private String code;
	private String nom;
	private float prix;
	private int quantite;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Medicament(String code, String nom, float prix, int quantite) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "Medicament [code=" + code + ", nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "]";
	}
	
	
	public Medicament() {
		
		
	}

}
