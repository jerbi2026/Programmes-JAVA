package Classes;

import java.util.Scanner;

public class Lettre  extends Courrier{
	
	private boolean prioritaire=false;
	
	
	public boolean isPrioritaire() {
		return prioritaire;
	}

	public void setPrioritaire(boolean prioritaire) {
		this.prioritaire = prioritaire;
	}

	public Lettre(String destination, String expediteur, double poids, boolean prioritaire) {
		super(destination, expediteur, poids);
		this.prioritaire = prioritaire;
	}
	
	public Lettre() {
		super();
		Scanner sc  = new Scanner(System.in);
		if(super.getPoids()<=20) {
			int pr=0;
			do {
				System.out.println("donner la prioritaire si oui tapez 1 sinon tapez 0");
				pr=sc.nextInt();
				
			}while(pr!=0 && pr!=1);
			if(pr==0) {
				this.prioritaire=false;
			}
			else {
				this.prioritaire=true;
			}
		}
		
		
	}
	
	public double prix_timbre() {
		double sum = 0;
		if(super.getPoids()<=20) {
			if(this.isPrioritaire()==true) {
				sum+=0.390;
			}
			else {
				sum+=0.250;
			}
			
		}
		
		if(super.getPoids()>20 && super.getPoids()<=250) {
			sum+=0.700;
		}
		else if(super.getPoids()>250 && super.getPoids()<=1000) {
			sum+=1.500;
		}
		else if(super.getPoids()>1000 && super.getPoids()<2000) {
			sum+=2.300;
		}
		return sum;
		
		
		
		
	}

	@Override
	public String toString() {
		return "Lettre [prioritaire=" + prioritaire + ", prix_timbre =" + prix_timbre() + "DT, courrier ="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	

}
