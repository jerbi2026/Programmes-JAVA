package Classes;

import java.util.ArrayList;

public class Gestionnaire {
	private ArrayList<Courrier> liste_courriers = new ArrayList<>();
	
	public void add_lettre() {
		Courrier lettre = new Lettre();
		liste_courriers.add(lettre);
		System.out.println("courrier added");
	}	
	
	public void add_colis() {
		
		Courrier colis = new Colis();
		liste_courriers.add(colis);
		System.out.println("courrier added");
	}	
	
	public void afficher_lettres() {
		
		System.out.println("la liste des lettres");
		for(int i =0 ; i<liste_courriers.size();i++) {
			if(liste_courriers.get(i) instanceof Lettre) {
				System.out.println(liste_courriers.get(i).toString());
			}
		}
	}
	
	public void afficher_colis() {
		System.out.println("la liste des colis");
		for(int i =0 ; i<liste_courriers.size();i++) {
			if(liste_courriers.get(i) instanceof Colis) {
				System.out.println(liste_courriers.get(i).toString());
			}
		}
	}
	
	
	
	
	

}
