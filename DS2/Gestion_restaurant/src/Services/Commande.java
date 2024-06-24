package Services;

import java.util.ArrayList;
import java.util.Scanner;

import Restaurant.Plat;
import Restaurant.Table;

public class Commande {
	private int id;
	private  Table table;
	private  ArrayList<Plat> orderItems;
	private  int quantity;
	private  boolean EtatPaye;
	
	public Commande(int id,Table table, ArrayList<Plat> orderItems, boolean etatPaye) {
		super();
		this.id=id;
		this.table = table;
		this.orderItems = orderItems;
		EtatPaye = etatPaye;
	}
	
	
	
	public Commande(int id, ArrayList<Plat> liste_plats,Table table) {
		this.id=id;
		this.orderItems=liste_plats;
		this.EtatPaye=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantite ");
		this.quantity=sc.nextInt();
		this.table=table;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public void setTable(Table table) {
		this.table = table;
	}



	public void setOrderItems(ArrayList<Plat> orderItems) {
		this.orderItems = orderItems;
	}



	public void setEtatPaye(boolean etatPaye) {
		EtatPaye = etatPaye;
	}



	public Table getTable() {
		return table;
	}

	public ArrayList<Plat>  getOrderItems() {
		return orderItems;
	}

	
	public boolean isEtatPaye() {
		return EtatPaye;
	}
	
	
	public double calculer_total_prix() {
		double prix_tot=0;
		for(int i=0;i<this.orderItems.size();i++) {
			prix_tot+=this.orderItems.get(i).calculer_prix();
		}
		
		return prix_tot;
	}
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Commande [table=" + table.toString() + ", prixTotale=" + calculer_total_prix() + "TND, EtatPaye=" + EtatPaye + "]";
	}



	
	
	/*
	public boolean payement() {
		String bool;
		Scanner sc = new Scanner(System.in);
		System.out.println("La commande est payé?(Y/N): ");
		bool=sc.next();
		if (bool.toUpperCase().equals("Y")) {
			return true;
			}else if(bool.toUpperCase().equals("N")){
				return false;
			}
	}*/
	
	
    
    

}
