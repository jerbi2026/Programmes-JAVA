package Classe;

public class Voiture {
	private String marque;
	private String categorie;
	private int nb_cheveaux;
	private boolean disponible = true;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getNb_cheveaux() {
		return nb_cheveaux;
	}
	public void setNb_cheveaux(int nb_cheveaux) {
		this.nb_cheveaux = nb_cheveaux;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public Voiture(String marque, String categorie, int nb_cheveaux) {
		super();
		this.marque = marque;
		this.categorie = categorie;
		this.nb_cheveaux = nb_cheveaux;
		this.disponible = true;
	}
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", categorie=" + categorie + ", nb_cheveaux=" + nb_cheveaux
				+ ", disponible=" + disponible + "]";
	}
	public Voiture() {
		
	}

}
