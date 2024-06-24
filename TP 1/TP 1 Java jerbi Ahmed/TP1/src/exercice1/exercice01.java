package exercice1;

import java.util.Scanner;

public class exercice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab = new int [20];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ; i<20;i++) {
			do {
				System.out.println("donner moi l'entier numero "+i);
				tab[i]=sc.nextInt();
				
			}while(tab[i]>50);
		}

	}

}
