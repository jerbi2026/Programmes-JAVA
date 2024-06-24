/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medecin_ds_2020;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author user
 */
public class Gestionnaire {
    private Vector<Patient> lpat=new Vector();
    //Méthode 1
public Patient Rech_pat(int CIN)
{

//Avec while ou for c'est pareil
   for(int i=0;i<lpat.size();i++){
   if(lpat.get(i).getCIN()==CIN){return lpat.get(i);}
   }
   return null;
}
//Méthode 2 Ajout patient avec CIN unique
public void ajouter_pat()
{
Scanner sc=new Scanner(System.in);

System.out.println("Donnez le numéro CIN");
int c=sc.nextInt();
if(Rech_pat(c)==null){
lpat.add(new Patient(c));}
else {System.out.println("Le CIN est déjà attribué à un patient");}

}

//Méthode 3 Ajout patient avec CIN en paramètre
public void ajouter_pat(int c)
{

lpat.add(new Patient(c));

}
//Méthode 4
public void Afficher_Patient()
{System.out.println("Liste des patients");

for (int i=0;i<lpat.size();i++){

System.out.println(lpat.get(i).toString());
}
}
    
}
