package Restaurant;


public final class OneMeal extends Meals{

	private Double remise=0.2;
	@Override
	public Double calculer_prix() {
		Double prix_final=super.prix*(1-this.remise);
		return prix_final;
		
	}
	
	public OneMeal(String nom) {
		super(nom);
	}

	public Double getRemise() {
		return remise;
	}

	public void setRemise(Double remise) {
		this.remise = remise;
	}

	@Override
	public String toString() {
		return "OneMeal [remise=" + remise + ", maindish=" + maindish + ", nom=" + nom + ", prix=" + prix + ", etat="
				+ etat + ", prix final=" + calculer_prix() + "]";
	}
	

}
