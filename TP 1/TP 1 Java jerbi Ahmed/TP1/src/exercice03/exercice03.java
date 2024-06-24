package exercice03;

import java.util.Random;

public class exercice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random() ;
		int compteur  =1;
		int val1=rd.nextInt(1000) ;
		int val2=rd.nextInt(1000) ;
		int val3=rd.nextInt(1000) ;
		System.out.println("les tentatives "+val1+" "+val2+" "+val3);
		 System.out.println("tentative "+compteur);
		if((val1 % 2 ==0) && (val2 % 2 ==0) && (val3 % 2 !=0)) {
			System.out.println("c'est exacte nombre de tentatives "+compteur);
			
		}
		else {
			while((val1 % 2 !=0) || (val2 % 2 !=0) || (val3 % 2 ==0)) {
				compteur++;
				 val1=rd.nextInt(1000) ;
				 val2=rd.nextInt(1000) ;
				 val3=rd.nextInt(1000) ;
				 System.out.println("les tentatives "+val1+" "+val2+" "+val3);
				 System.out.println("tentative "+compteur);
				if((val1 % 2 ==0) && (val2 % 2 ==0) && (val3 % 2 !=0)) {
					System.out.println("c'est exacte nombre de tentatives "+compteur);
				}
			}
		}

	}

}
