package Main;

import Personne.Authentification;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Authentification auth = new Authentification();
		
		auth.ajouter_admin();
		auth.ajouter_cuisinier();
		auth.ajouter_livreur();
		auth.ajouter_serveur();
		auth.interface_internaute();

	}

}
