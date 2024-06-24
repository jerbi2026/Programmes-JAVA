package Classes;

public class Colis extends Courrier{
	
	public Colis() {
		super();
	}
	
	
	public double calcul_timbre() {
		double sum=4.300;
		if(super.getPoids()==2000) {
			sum=4.300;
		}
		else {
			
			double poids_sup = this.getPoids()-2000;
			sum += (poids_sup/1000)*0.3;
		}
		return sum;
	}


	@Override
	public String toString() {
		return "Colis [prix_timbre =" + calcul_timbre() + "DT, courrier =" + super.toString() + "]";
	}
	
	
	

}
