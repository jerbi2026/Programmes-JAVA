package Personne;

import java.util.Scanner;

public abstract class Employee extends Personne{
	
	protected String password;
	
	public Employee(int num_cin) {
		super(num_cin);
		Scanner sc = new Scanner(System.in);
		System.out.println("Password : ");
		this.password=sc.next();
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [password=" + password + ", num_cin=" + num_cin + ", nom=" + nom + "]";
	}

	
	
	
	

}
