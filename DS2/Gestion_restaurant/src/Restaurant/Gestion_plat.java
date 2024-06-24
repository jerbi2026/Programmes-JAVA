package Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_plat {
	
	private ArrayList<Plat> liste_plats = new ArrayList<>();
	
	private ArrayList<Table> liste_tables = new ArrayList<Table>();
	
	
	public Plat find_plat(String nom) {
		
		for(int i=0;i<liste_plats.size();i++) {
			if(liste_plats.get(i).getNom().equals(nom)==true) {
				return liste_plats.get(i);
			}
		}
		
		return null;
	}
	
	public void add_plat() {
		Scanner sc = new Scanner(System.in);
		String nom;
		System.out.println("Le nom du plat");
		nom=sc.next();
		if(find_plat(nom)==null) {
			int choix ;
			do {
				System.out.println("Le type du plat");
				System.out.println("1- One Meal");
				System.out.println("2- Three Meals");
				System.out.println("3- Quitter");
				choix=sc.nextInt();
				if(choix==1) {
					Plat one_meal = new OneMeal(nom);
					liste_plats.add(one_meal);
					System.out.print("Plat ajoute");
					break;
					
				}
				if(choix==2) {
					Plat three_meal = new ThreeMeal(nom);
					liste_plats.add(three_meal);
					System.out.println("Plat ajoute");
					break;
					
				}
			}while(choix!=3);
		}
		else {
			System.out.println("Plat existe deja");
		}
		
	}
	
	
	

	
	
	public void preparer_plat() {
		Scanner sc = new Scanner(System.in);
		String nom;
		System.out.print("Le nom du plat");
		nom=sc.next();
		if(find_plat(nom)!=null) {
			find_plat(nom).setEtat(true);
		}
		else {
			System.out.print("Plat existe deja");
		}
		
	}
	
	public void afficher_plat_one_meal() {
		System.out.print("Plat One Meal");
		for(int i =0;i<liste_plats.size();i++) {
			if(liste_plats.get(i) instanceof OneMeal) {
				OneMeal om = (OneMeal) liste_plats.get(i);
				System.out.println(om.toString());
			}
		}
	}
	
	public void afficher_plat_three_meal() {
		System.out.print("Plat Three Meal");
		for(int i =0;i<liste_plats.size();i++) {
			if(liste_plats.get(i) instanceof ThreeMeal) {
				ThreeMeal om = (ThreeMeal) liste_plats.get(i);
				System.out.println(om.toString());
			}
		}
	}
	
	public void afficher_plat_pret() {
		System.out.print("Plat prets");
		for(int i =0;i<liste_plats.size();i++) {
			if(liste_plats.get(i).isEtat()==true) {
				System.out.println(liste_plats.get(i).toString());
			}
		}
	}
	
	public void afficher_plat_non_pret() {
		System.out.print("Plat non prets");
		for(int i =0;i<liste_plats.size();i++) {
			if(liste_plats.get(i).isEtat()==false) {
				System.out.println(liste_plats.get(i).toString());
			}
		}
		
	}
	
	public void afficher_plats() {
		System.out.print("Tous les plats");
		for(int i =0;i<liste_plats.size();i++) {
			System.out.println(liste_plats.get(i).toString());
		}
		
	}
	
	public void consulter_plats() {
		Scanner sc = new Scanner(System.in);
		int choix;
		do {
			System.out.println("La liste des plats");
			System.out.println("1- Plats One Meal");
			System.out.println("2- Plats Three Meals");
			System.out.println("3- Plats Prets ");
			System.out.println("4- Plats non Prets ");
			System.out.println("5- Tous les Plats ");
			System.out.println("6- Quitter");
			System.out.println("Choix: ");
			choix=sc.nextInt();
			if(choix==1) {
				afficher_plat_one_meal();
			}
			if(choix==2) {
				afficher_plat_three_meal();
			}
			if(choix==3) {
				afficher_plat_pret();
			}
			if(choix==4) {
				afficher_plat_non_pret();
			}
			if(choix==5) {
				afficher_plats();
			}
			if(choix==6) {
				System.out.println("Merci");
			}
			
		}while(choix!=6);
		
	}
	
	
	public Table findAppropriateTable(String id){
		Table appropriateTable =  null;
		for(Table table: liste_tables){
			if(table.getID().equals(id)==true) {
				appropriateTable=table;
			}
			
		}
		return appropriateTable;
	}
	
	
	
	public void addTable() {
		Scanner sc = new Scanner(System.in);
		String id;
		do {
			System.out.println("ID du table");
			 id =  sc.next();
		}while(findAppropriateTable(id)!=null);
		liste_tables.add(new Table(id));
		
	}
	
	public void afficher_table() {
		System.out.println("les tables");
		for(int i=0;i<liste_tables.size();i++) {
			System.out.println(liste_tables.get(i).toString());
		}
	}
	
	public void reserver_table() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID du table");
		String id =  sc.next();
		if(findAppropriateTable(id)!=null) {
			if(findAppropriateTable(id).getDispo().isDispo()==false) {
				System.out.print("Entrez la date d'emprunt (YYYY-MM-DD) : ");
		        String dateSaisie = sc.next();

		        LocalDate dateNotif = LocalDate.parse(dateSaisie);
		        findAppropriateTable(id).getDispo().setDateEmp(dateNotif);
		        System.out.println("Table "+id+" reserve");
			}
			else {
				System.out.println("Table deja reserve");
			}
		}
		else {
			System.out.println("Table n'existe pas");
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
