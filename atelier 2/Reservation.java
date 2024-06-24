package classes;

public class Reservation {
	private Vol vol;
	private Passager client;
	private int nb_billets;
	private String mode_paiement;
	private int code;
	private String date;
	public Reservation(Vol vol, Passager client, int nb_billets, String mode_paiement, int code, String date) {
		super();
		this.vol = vol;
		this.client = client;
		this.nb_billets = nb_billets;
		this.mode_paiement = mode_paiement;
		this.code = code;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Reservation [vol=" + vol.toString() + ", client=" + client.toString() + ", nb_billets=" + nb_billets + ", mode_paiement="
				+ mode_paiement + ", code=" + code + ", date=" + date + "]";
	}
	
	
	public float montant_total() {
		return this.nb_billets*vol.getPrix();
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public Passager getClient() {
		return client;
	}
	public void setClient(Passager client) {
		this.client = client;
	}
	public int getNb_billets() {
		return nb_billets;
	}
	public void setNb_billets(int nb_billets) {
		this.nb_billets = nb_billets;
	}
	public String getMode_paiement() {
		return mode_paiement;
	}
	public void setMode_paiement(String mode_paiement) {
		this.mode_paiement = mode_paiement;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
