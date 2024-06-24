package Classe;

public class Contrat {
	private Client client;
	private Voiture voiture;
	private String date_debut;
	private String date_fin;
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}
	public Contrat(Client client, Voiture voiture, String date_debut, String date_fin) {
		super();
		this.client = client;
		this.voiture = voiture;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	@Override
	public String toString() {
		return "Contrat [client=" + client.toString() + ", voiture=" + voiture.toString() + ", date_debut=" + date_debut + ", date_fin="
				+ date_fin + "]";
	}
	
	public Contrat() {
		
	}
	

}
