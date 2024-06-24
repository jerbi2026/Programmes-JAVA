package Classes;

import java.util.ArrayList;

public class Commande {
	
	private ArrayList<Produit> liste_produits_achetes;
	private Client client;
	private String mode_paiement;
	private String code;
	private String date;
	public ArrayList<Produit> getListe_produits_achetes() {
		return liste_produits_achetes;
	}
	public void setListe_produits_achetes(ArrayList<Produit> liste_produits_achetes) {
		this.liste_produits_achetes = liste_produits_achetes;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getMode_paiement() {
		return mode_paiement;
	}
	public void setMode_paiement(String mode_paiement) {
		this.mode_paiement = mode_paiement;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Commande(ArrayList<Produit> liste_produits_achetes, Client client, String mode_paiement, String code,
			String date) {
		super();
		this.liste_produits_achetes = liste_produits_achetes;
		this.client = client;
		this.mode_paiement = mode_paiement;
		this.code = code;
		this.date = date;
	}
	
	public String affiche_produits() {
		String liste="";
		for(int i=0;i<liste_produits_achetes.size();i++) {
			liste=liste+liste_produits_achetes.get(i).toString();
			liste=liste+"\n";
		}
		return liste;
	}
	
	@Override
	public String toString() {
		return "Commande [liste_produits_achetes=" + affiche_produits() + ", client=" + client.toString() + ", mode_paiement="
				+ mode_paiement + ", code=" + code + ", date=" + date + "]";
	}
	
	
	
	

}
