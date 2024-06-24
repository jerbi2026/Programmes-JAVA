package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordonnance {
	private int identifient;
	private String nom_med;
	private ArrayList<Prescription> liste_presc;
	private String date;
	private Patient patient;
	
	
	public int getIdentifient() {
		return identifient;
	}
	public String getNom_med() {
		return nom_med;
	}
	public void setNom_med(String nom_med) {
		this.nom_med = nom_med;
	}
	public ArrayList<Prescription> getListe_presc() {
		return liste_presc;
	}
	public void setListe_presc(ArrayList<Prescription> liste_presc) {
		this.liste_presc = liste_presc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public Ordonnance(int identifient, String nom_med,ArrayList<Prescription> liste, String date,
			Patient patient) {
		
		this.identifient = identifient;
		this.nom_med = nom_med;
		this.date = date;
		this.patient = patient;
	}
	
	
	private String afficher_liste_pescription() {
		String liste="";
		for(int i=0;i<this.liste_presc.size();i++) {
			liste  = liste+this.liste_presc.get(i).toString();
			liste= liste+"\n";
		}
		return liste;
	}
	
	
	//j'ai pas pu faire l'ordre avec la date vu que la date est de type string non de type localDate 
	
	@Override
	public String toString() {
		return "Ordonnance [nom_med=" + nom_med + ", liste_presc=" + afficher_liste_pescription() + ", date=" + date + ", patient="
				+ patient.toString() + "]";
	}
	
	
	
	public void ajouter_prescription() {
		if (this.liste_presc == null) {
            this.liste_presc = new ArrayList<>();
        }
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le nom de medicament");
		String nom_med = sc.next();
		int nb_administration;
		int nb_dosage;
		
		do {
			System.out.println("donner le nombre d'administration par jours");
			nb_administration = sc.nextInt();
		}while(nb_administration<1);
		
		do {
			System.out.println("donner le dosage");
			nb_dosage = sc.nextInt();
		}while(nb_dosage<1);
		
		Prescription new_pers = new Prescription(nom_med,nb_administration,nb_dosage);
		
		
		this.liste_presc.add(new_pers);
		
		System.out.println("Prescription ajouté");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
