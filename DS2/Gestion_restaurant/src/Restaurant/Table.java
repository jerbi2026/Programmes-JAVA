package Restaurant;

import java.util.Scanner;

public class Table {
	private String ID;
	private int capacity;
	private disoponibility dispo;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public disoponibility getDispo() {
		return dispo;
	}
	public void setDispo(disoponibility dispo) {
		this.dispo = dispo;
	}
	public Table(String iD) {
		super();
		this.ID = iD;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Capacity");
			this.capacity=sc.nextInt();
		}while(this.capacity<1);
		this.dispo = new disoponibility();
	}
	@Override
	public String toString() {
		return "table [ID=" + ID + ", capacity=" + capacity +"disponibility : "+dispo.toString()+ "]";
	}
	
	
	

}
