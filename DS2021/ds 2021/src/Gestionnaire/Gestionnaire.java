package Gestionnaire;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Patient;
import classes.RDV;

public class Gestionnaire {
	
	private ArrayList<Patient> liste_patients = new ArrayList<Patient>();
	private ArrayList<RDV> liste_rdv = new ArrayList<RDV>();
	
	
	public Patient rech_patient(int cin) {
		
		Patient p = new Patient();
		boolean trouv = false;
		
		for(int i =0;i<liste_patients.size();i++) {
			if(liste_patients.get(i).getCin()==cin) {
				p=liste_patients.get(i);
				trouv = true;
				break;
			}
		}
		if(trouv==true) {
			return p;
		}
		else {
			return null;
		}
		
		
		
		
	}
	
	
	public void ajout_patient() {
		int cin;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("donner le numero de cin");
		cin = sc.nextInt();
		if(rech_patient(cin)==null) {
			System.out.println("donner le nom");
			String nom = sc.next();
			String sang;
			do {
				System.out.println("donner le groupe sanguin : A ou B ou AB ou O");
				sang=sc.next();
			}while(sang.toUpperCase().equals("A")==false  && sang.toUpperCase().equals("B")==false && sang.toUpperCase().equals("AB")==false && sang.toUpperCase().equals("O")==false);
			String rhesus;
			do {
				System.out.println("donner le rhesus : + ou -");
				rhesus = sc.next();
				
			}while(rhesus.equals("+")==false && rhesus.equals("-")==false);
			
			int diab;
			boolean diabete;
			do {
				System.out.println("est ce qu'il est diabete : si oui tapez 1 sinon 0");
				diab=sc.nextInt();
			}while(diab!=0 && diab!=1);
			if(diab==0) {
				diabete=false;
			}
			else {
				diabete = true;
			}
			Patient p  = new Patient(cin,nom,sang,rhesus,diabete);
			liste_patients.add(p);
			System.out.println("patient ajoute");
		}
		else {
			System.out.println("patient existe deja");
		}
	}
	
	public Patient ajout_patient_avec_cin(int cin) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("donner le nom");
		String nom = sc.next();
		String sang;
		do {
			System.out.println("donner le groupe sanguin : A ou B ou AB ou O");
			sang=sc.next();
		}while(sang.toUpperCase().equals("A")==false  && sang.toUpperCase().equals("B")==false && sang.toUpperCase().equals("AB")==false && sang.toUpperCase().equals("O")==false);
		String rhesus;
		do {
			System.out.println("donner le rhesus : + ou -");
			rhesus = sc.next();
			
		}while(rhesus.equals("+")==false && rhesus.equals("-")==false);
		
		int diab;
		boolean diabete;
		do {
			System.out.println("est ce qu'il est diabete : si oui tapez 1 sinon 0");
			diab=sc.nextInt();
		}while(diab!=0 && diab!=1);
		if(diab==0) {
			diabete=false;
		}
		else {
			diabete = true;
		}
		Patient p  = new Patient(cin,nom,sang,rhesus,diabete);
		liste_patients.add(p);
		System.out.println("patient ajoute");
		return p;
	}
	
	
	public void ajout_rdv() {
		int cin ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("donner le numero de cin");
		cin = sc.nextInt();
		if(rech_patient(cin)==null) {
			Patient p  = ajout_patient_avec_cin(cin);
			System.out.println("donner la date");
			String date  = sc.next();
			RDV new_rdv = new RDV(date,p);
			liste_rdv.add(new_rdv);
			System.out.println("RDV ajoutee");
			
		}
		else {
			Patient p = rech_patient(cin);
			System.out.println("donner la date");
			String date  = sc.next();
			RDV new_rdv = new RDV(date,p);
			liste_rdv.add(new_rdv);
			System.out.println("RDV ajoutee");
		}
		
		
		
		
	}
	
	public void affiche_patient() {
		for(int i =0;i<liste_patients.size();i++) {
			System.out.println(liste_patients.get(i).toString());
		}
	}
	
	public void affiche_rdv() {
		for(int i =0;i<liste_rdv.size();i++) {
			System.out.println(liste_rdv.get(i).toString());
		}
	}
	
	public void afficher_rdv_ajourdhui() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner la date");
		String date = sc.next();
		int i=0;
		while(i<liste_rdv.size()) {
			if(liste_rdv.get(i).getDate().equals(date)) {
				System.out.println(liste_rdv.get(i).toString());
			}
			i++;
		}
		
		
	}
	

}
