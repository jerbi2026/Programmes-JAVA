package exercice04;

import java.util.Arrays;
import java.util.Scanner;

public class exercice_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		String [] tab = new String[5];
		String [] frs = new String[5];
		
		
		
		for(int i=0;i<5;i++) {
			System.out.println("donnner email du fournisseur numero "+i);
			tab[i]=sc.next();
			int j =tab[i].indexOf("@");
			String fournisseur = tab[i].substring(j+1);
			frs[i]=fournisseur;
			
			
			
		}

        Arrays.sort(frs);
        int compt = 0;
        for (int i = 0; i < 5; i++) {
            compt++;

            if (i == 5 - 1 || frs[i].equals(frs[i + 1])==false) {
                System.out.println("Le fournisseur " + frs[i] + " a " + compt + " clients");
                compt = 0;
            }
        }
		

	}

}
