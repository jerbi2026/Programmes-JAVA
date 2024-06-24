package Personne;

public final class Admin extends Employee{

	public Admin(int num_cin) {
		super(num_cin);
		
	}

	@Override
	public String toString() {
		return "Admin [password=" + password + ", num_cin=" + num_cin + ", nom=" + nom + "]";
	}
	
	

}
