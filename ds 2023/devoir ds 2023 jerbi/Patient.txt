package Classes;

import java.util.Scanner;

public class Patient {
	private int cin;
	private String nom;
	
	private String groupe_sang;
	private char rhesus;
	private int age;
	
	private String statut_marital;
	
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

	public String getGroupe_sang() {
		return groupe_sang;
	}

	public void setGroupe_sang(String groupe_sang) {
		this.groupe_sang = groupe_sang;
	}

	public char getRhesus() {
		return rhesus;
	}

	public void setRhesus(char rhesus) {
		this.rhesus = rhesus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStatut_marital() {
		return statut_marital;
	}

	public void setStatut_marital(String statut_marital) {
		this.statut_marital = statut_marital;
	}

	public boolean isDiabete() {
		return diabete;
	}

	public void setDiabete(boolean diabete) {
		this.diabete = diabete;
	}

	public Patient(int cin, String nom, String groupe_sang, char rhesus, int age, String statut_marital,
			boolean diabete) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.groupe_sang = groupe_sang;
		this.rhesus = rhesus;
		this.age = age;
		this.statut_marital = statut_marital;
		this.diabete = diabete;
	}
	
	public Patient(int cin) {
		this.cin=cin;
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le nom");
		this.nom = sc.next();
		
		do {
			System.out.println("donner le groupe sanguin (A ou B ou AB ou O)");
			this.groupe_sang = sc.next();
		}while(!this.groupe_sang.toUpperCase().equals("A") &&!this.groupe_sang.toUpperCase().equals("B") &&!this.groupe_sang.toUpperCase().equals("AB")&&!this.groupe_sang.toUpperCase().equals("O") );
		
		do {
			System.out.println("donner le rhesus soit + soit -");
			this.rhesus = sc.next().charAt(0);
		}while(this.rhesus!='+' && this.rhesus!='-');
		
		do {
			System.out.println("donner le statut marital (marie ou celibataire ou divorce ou veuf)");
			this.statut_marital = sc.next();
		}while(!this.statut_marital.toUpperCase().equals("MARIE") &&!this.statut_marital.toUpperCase().equals("CELIBATAIRE") &&!this.statut_marital.toUpperCase().equals("DIVORCE")&&!this.statut_marital.toUpperCase().equals("VEUF") );
		
		do {
			System.out.println("donner l'age");
			this.age=sc.nextInt();
		}while(this.age<0);
		
		int diab;
		
		do {
			System.out.println("est ce qu'il est diabete si oui tapez 1 sinon tapez 0");
			diab  = sc.nextInt();
		}while(diab!=0 && diab!=1);
		
		if(diab==1) {
			this.diabete=true;
		}
		else {
			this.diabete=false;
		}
		
	}

	@Override
	public String toString() {
		return "Patient [cin=" + cin + ", nom=" + nom + ", groupe_sang=" + groupe_sang + ", rhesus=" + rhesus + ", age="
				+ age + ", statut_marital=" + statut_marital + ", diabete=" + diabete + "]";
	}
	
	

}
