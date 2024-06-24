package Restaurant;

import java.util.Scanner;

public final class ThreeMeal extends Meals{
	
	
	private String starter;
	private String dessert;
	private double remise=0.1;
	@Override
	public Double calculer_prix() {
		Double prix_final=super.prix*(1-this.remise);
		return prix_final;
	}
	
	public ThreeMeal(String nom) {
		super(nom);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Starter");
		this.starter=sc.next();
		System.out.println("Dessert");
		this.dessert=sc.next();
		
		
	}

	@Override
	public String toString() {
		return "ThreeMeal [starter=" + starter + ", dessert=" + dessert + ", remise=" + remise + ", maindish="
				+ maindish + ", nom=" + nom + ", prix=" + prix + ", etat=" + etat + ", prix final="
				+ calculer_prix() + "]";
	}
	
	
	
	

}
