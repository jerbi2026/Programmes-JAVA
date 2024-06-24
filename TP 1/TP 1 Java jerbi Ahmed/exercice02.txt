package exercice2;

import java.util.Random;
import java.util.Scanner;

public class exercice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random() ;
		int val=rd.nextInt(1000) ;
		System.out.println("l'entier a deviner est "+val);
		int user;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("devinez l'entier");
			user = sc.nextInt();
			if(user==val) {
				System.out.println("c'est exacte");
			}
			else if(val>user) {
				System.out.println("c'est moins");
			}
			else {
				System.out.println("c'est plus");
			}
		}while(user!=val);

	}

}
