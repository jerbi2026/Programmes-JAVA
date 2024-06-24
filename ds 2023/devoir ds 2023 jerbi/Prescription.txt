package Classes;

public class Prescription {
	private String nom_medicament;
	private int nb_administration;
	private int dosage;
	public String getNom_medicament() {
		return nom_medicament;
	}
	public void setNom_medicament(String nom_medicament) {
		this.nom_medicament = nom_medicament;
	}
	public int getNb_administration() {
		return nb_administration;
	}
	public void setNb_administration(int nb_administration) {
		this.nb_administration = nb_administration;
	}
	public int getDosage() {
		return dosage;
	}
	public void setDosage(int dosage) {
		this.dosage = dosage;
	}
	public Prescription(String nom_medicament, int nb_administration, int dosage) {
		super();
		this.nom_medicament = nom_medicament;
		this.nb_administration = nb_administration;
		this.dosage = dosage;
	}
	@Override
	public String toString() {
		return "Prescription [nom_medicament=" + nom_medicament + ", nb_administration=" + nb_administration
				+ ", dosage=" + dosage + "]";
	}
	
	
	

}
