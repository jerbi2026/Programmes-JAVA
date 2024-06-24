package Personne;

import java.util.Scanner;

public final class Cuisinier extends Employee{

	
	private int rate;
	public Cuisinier(int num_cin) {
		super(num_cin);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Rate");
			this.rate=sc.nextInt();
		}while(this.rate>5 && this.rate<0);
		
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Cuisinier [rate=" + rate + ", password=" + password + ", num_cin=" + num_cin + ", nom=" + nom + "]";
	}
	
	

}
