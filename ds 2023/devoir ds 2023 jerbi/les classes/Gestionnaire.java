package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestionnaire {
	
	private ArrayList<Patient> liste_patients = new ArrayList<Patient>();
	private ArrayList<Ordonnance> liste_ordonnances = new ArrayList<Ordonnance>();
	
	
	
	
	
	
	//Methode1
	public Patient Rech_patient(int cin) {
		for(int i=0;i<liste_patients.size();i++) {
			if(liste_patients.get(i).getCin()==cin) {
				return liste_patients.get(i);
			}
		}
		return null;
	}
	
	
	//Methode2
	
	public void ajouter_patient() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le cin de patient");
		int cin = sc.nextInt();
		if(Rech_patient(cin)==null) {
			Patient new_pat = new Patient(cin);
			liste_patients.add(new_pat);
			System.out.println("patient ajouté");
		}
		else {
			System.out.println("patient existe deja");
			System.out.println(Rech_patient(cin).toString());
		}
	}
	
	//Methode 3
	
	public void afficher_patient_ab() {
		System.out.println("La liste des patients qui ont un sang AB+");
		for(int i=0;i<liste_patients.size();i++) {
			if(liste_patients.get(i).getGroupe_sang().toUpperCase().equals("AB")==true && liste_patients.get(i).getRhesus()=='+' ) {
				System.out.println(liste_patients.get(i).toString());
				
			}
		}
	}
	
	
	//Methode 4
	
	public void ajouter_ordonnance() {
		Scanner sc = new Scanner(System.in);
		int cin;
		do {
			System.out.println("donner le cin de patient");
			cin = sc.nextInt();
		}while(Rech_patient(cin)==null);
		int identifiant;
		
		if(liste_ordonnances.size()==0){
			identifiant=1;
		}
		else {
			identifiant = liste_ordonnances.get(liste_ordonnances.size()-1).getIdentifient()+1;
		}
		System.out.println("donner le nom du medecin");
		String nom_med = sc.next();
		
		System.out.println("donner la date");
		String date = sc.next();
		ArrayList<Prescription> liste_pres = new ArrayList<Prescription> ();
		
		Ordonnance new_ord = new Ordonnance(identifiant,nom_med,liste_pres,date,Rech_patient(cin));
		
		
		int stop;
		
		do {
			System.out.println("ajouter prescription ? si oui tapez 1 sinon tapez 0 ");
			stop=sc.nextInt();
			if(stop==1) {
				new_ord.ajouter_prescription();
			}
			
			
		}while(stop!=0);
		
		liste_ordonnances.add(new_ord);
		System.out.println("ordonnace ajouté");
		
		
	}
	
	
	//Methode 5
	
	
	public void afficher_occurence_medicament() {
		String nom_med;
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le nom de medicament");
		nom_med = sc.next();
		int nb_occurence=0;
		for(int i = 0; i<liste_ordonnances.size();i++) {
			for(int j=0;j<liste_ordonnances.get(i).getListe_presc().size();j++) {
				if(liste_ordonnances.get(i).getListe_presc().get(j).getNom_medicament().equals(nom_med)==true) {
					nb_occurence++;
				}
			}
		}
		System.out.println("il apparait  "+nb_occurence);
	}
	
	
	//Methode 6
	
	public void afficher_ordonnance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le cin de patient");
		int cin = sc.nextInt();
		
		System.out.println("donner la date ");
		String date = sc.next();
		
		if(Rech_patient(cin)!=null) {
			
			System.out.println("la liste des ordonnances");
			
			for(int i=0;i<liste_ordonnances.size();i++) {
				if(liste_ordonnances.get(i).getDate().equals(date)==true && liste_ordonnances.get(i).getPatient()==Rech_patient(cin)) {
					
					System.out.println(liste_ordonnances.get(i).toString());
					
				}
			}
		}
		else {
			System.out.println("client inexistant ");
		}
		
		
	}
	
	
	

}
