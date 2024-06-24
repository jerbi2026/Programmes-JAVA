package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestionnaire_compagnie {
	private ArrayList<Passager> liste_passagers = new ArrayList<Passager>();
	private ArrayList<Vol> liste_vols = new ArrayList<Vol>();
	private ArrayList<Reservation> liste_reservation = new ArrayList<Reservation>();

	
	public Passager Rech_passager(String code) {
		for(int i=0;i<liste_passagers.size();i++) {
			if(liste_passagers.get(i).getNumero_passeport().equals(code)) {
				return liste_passagers.get(i);
			}
		}
		return null;
	}
	
	public void ajout_passager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le numero de passeport");
		String num_pass=sc.next();
		if(Rech_passager(num_pass)==null) {
			Passager new_pass= new Passager(num_pass);
			liste_passagers.add(new_pass);
			System.out.println("passager ajouté");
		}
		else {
			System.out.println("passager existe");
			System.out.println(Rech_passager(num_pass).toString());
		}
	}
	
	public Vol Rech_vol(String code) {
		for(int i=0;i<liste_vols.size();i++) {
			if(liste_vols.get(i).getReference().equals(code)) {
				return liste_vols.get(i);
			}
		}
		return null;
	}
	
	public void ajout_vol() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner la reference du vol");
		String reference=sc.next();
		if(Rech_vol(reference)==null) {
			Vol new_vol = new Vol(reference);
			liste_vols.add(new_vol);
		}
		else {
			
			System.out.println("reference existe");
			System.out.println(Rech_vol(reference).toString());
		}
	}
	
	
	public void ajout_reservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le numero de passeport du client");
		String num_pass=sc.next();
		System.out.println("donner la reference du vol");
		String reference=sc.next();
		if(Rech_passager(num_pass)!=null && Rech_vol(reference)!=null) {
			int code;
			if(liste_reservation.size()==0) {
				code=1;
			}
			else {
				code = liste_reservation.get(liste_reservation.size()-1).getCode()+1;
			}
			int nb_billets;
			do {
				System.out.println("donner le nombre de billets");
				nb_billets=sc.nextInt();
			}while(nb_billets<0);
			System.out.println("donner la date");
			String date=sc.next();
			String mode_paiement;
			do {
				System.out.println("donner le mode de paiement (espece ou banque ou cheque)");
				mode_paiement = sc.next();
				
			}while(!mode_paiement.equals("espece") && !mode_paiement.equals("banque") && !mode_paiement.equals("cheque") );
			
			Reservation new_reservation = new Reservation(Rech_vol(reference),Rech_passager(num_pass),nb_billets,mode_paiement,code,date);
			liste_reservation.add(new_reservation);
			System.out.println("prix total :"+new_reservation.montant_total());
			
			
			
			
		}
		else {
			System.out.println("probleme de données");
			
		}
		
		
		
		
	}
	
	public void afficher_chiffre_affaire_vol() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner la reference du vol");
		String reference=sc.next();
		if(Rech_vol(reference)!=null) {
			float prix_total=0;
			for(int i=0;i<liste_reservation.size();i++) {
				if(liste_reservation.get(i).getVol()==Rech_vol(reference)) {
					prix_total+=liste_reservation.get(i).montant_total();
				}
			}
			System.out.println("le prix de la vol est "+prix_total);
		}
		else {
			System.out.println("probleme de données");
		}
		
		
	}
	
	public void afficher_passager_vol() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner la reference du vol");
		String reference=sc.next();
		if(Rech_vol(reference)!=null) {
			
			for(int i=0;i<liste_reservation.size();i++) {
				if(liste_reservation.get(i).getVol()==Rech_vol(reference)) {
					System.out.println(liste_reservation.get(i).getClient().toString());
					
				}
			}
			
		}
		else {
			System.out.println("probleme de données");
		}
		
		
	}
	
	public void afficher_reserv() {
		for(int i=0;i<liste_reservation.size();i++) {
			System.out.println(liste_reservation.get(i).toString());
		}
		
	}
	
}
