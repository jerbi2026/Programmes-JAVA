package Restaurant;

import java.util.Scanner;

public abstract class Meals  extends Plat{
	protected String maindish;

	@Override
	public abstract Double calculer_prix();
	
	public Meals(String nom) {
		super(nom);
		Scanner sc = new Scanner(System.in);
		System.out.println("Maindish : ");
		this.maindish=sc.next();
		
		
	}

	public String getMaindish() {
		return maindish;
	}

	public void setMaindish(String maindish) {
		this.maindish = maindish;
	}
	
	
	

}
