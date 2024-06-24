package Medicaments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestionnaire {
	private List<Medicament> liste_med = new ArrayList<Medicament>();
	
	public Medicament Rech_Med(String Ref) {
		Medicament md = new Medicament();
		for(int i=0;i<liste_med.size();i++) {
			if(liste_med.get(i).getCode()==Ref) {
				md= liste_med.get(i);
				break;
			
			}
		}
		if(md!=null) {
			return md;
		}
		else {
			return null;
		}
	}
	
	
	public void ajouter_med() {
		Scanner sc  = new Scanner(System.in);
		String code;
		String nom;
		int quantite;
		float prix;
		System.out.println("donner le code (alphanumerique)");
		code=sc.next();
		System.out.println("donner le nom");
		nom=sc.next();
		do {
			System.out.println("donner le prix");
			prix=sc.nextFloat();
		}while(prix<0);
		do {
			System.out.println("donner la quantite");
			quantite=sc.nextInt();
		}while(quantite<0);
		liste_med.add(new Medicament(code,nom,prix,quantite));
		System.out.println("Medicament ajouté");
		
		
		
	}
	
	public void affiche_liste() {
		System.out.println("La liste de medicaments");
		for(int i =0;i<liste_med.size();i++) {
			System.out.println(liste_med.get(i).toString());
		}
	}
	
	
	public void vente_med() {
		Scanner sc  = new Scanner(System.in);
		String code;
		System.out.println("donner le code (alphanumerique)");
		code=sc.next();
		Medicament md = Rech_Med(code);
		if(md==null) {
			System.out.println("medicament introuvable");
			
		}
		else {
			int quantite;
			do {
				System.out.println("donner la quantite");
				quantite=sc.nextInt();
			}while(quantite>md.getQuantite());
			float Montant = md.getPrix()*quantite;
			md.setQuantite(md.getQuantite()-quantite);
			System.out.println("Le montant total est "+Montant);
			System.out.println("Merci");
			
			
		}
		
	}
	

}
