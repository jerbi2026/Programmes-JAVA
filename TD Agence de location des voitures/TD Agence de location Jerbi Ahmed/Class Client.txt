package Classe;

public class Client {
	private String nom;
	private int num_permis;
	private int num_tel;
	private int cin;
	private String adresse;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNum_permis() {
		return num_permis;
	}
	public void setNum_permis(int num_permis) {
		this.num_permis = num_permis;
	}
	public int getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Client(String nom, int num_permis, int num_tel, int cin, String adresse) {
		super();
		this.nom = nom;
		this.num_permis = num_permis;
		this.num_tel = num_tel;
		this.cin = cin;
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", num_permis=" + num_permis + ", num_tel=" + num_tel + ", cin=" + cin
				+ ", adresse=" + adresse + "]";
	}
	
	public Client() {
		
	}

}
