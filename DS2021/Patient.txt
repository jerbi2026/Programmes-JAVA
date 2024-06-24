package classes;

public class Patient {
	private int cin;
	private String nom;
	private String groupe_sang;
	private String rhesus;
	private boolean diabete;
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
	public String getGroupe_sabng() {
		return groupe_sang;
	}
	public void setGroupe_sabng(String groupe_sabng) {
		this.groupe_sang = groupe_sabng;
	}
	public String getRhesus() {
		return rhesus;
	}
	public void setRhesus(String rhesus) {
		this.rhesus = rhesus;
	}
	public boolean isDiabete() {
		return diabete;
	}
	public void setDiabete(boolean diabete) {
		this.diabete = diabete;
	}
	public Patient(int cin, String nom, String groupe_sabng, String rhesus, boolean diabete) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.groupe_sang = groupe_sabng;
		this.rhesus = rhesus;
		this.diabete = diabete;
	}
	@Override
	public String toString() {
		return "Patient [cin=" + cin + ", nom=" + nom + ", groupe_sabng=" + groupe_sang + ", rhesus=" + rhesus
				+ ", diabete=" + diabete + "]";
	}
	
	
	public Patient() {}
	

}
