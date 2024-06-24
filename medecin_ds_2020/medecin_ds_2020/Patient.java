/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medecin_ds_2020;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Patient {
   
private int CIN;
private String nom, gs;
private char rs;
private boolean diabete;
private LocalDate date_compte;

//Mutateurs de l'attribut CIN
public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN; }
//Constructeur
public Patient (int cin)
{
this.CIN=cin;
Scanner sc=new Scanner(System.in);
System.out.println("Quel est le nom du patient");
this.nom=sc.nextLine();

do{
System.out.println("Quel est votre groupe sanguin : A, B, O ou AB");
this.gs=sc.nextLine();
}
while(!this.gs.equalsIgnoreCase("A") & !this.gs.equalsIgnoreCase("B")& !this.gs.equalsIgnoreCase("O")& !this.gs.equalsIgnoreCase("AB"));
// accepter equals tout court
do{
System.out.println("Quel est votre Rhésus : +, -");
this.rs=sc.nextLine().charAt(0);
}
while(this.rs!='+'&this.rs!='-');
//pour diabte soit le schéma en dessous soit appeler tout court  nextBoolean()
int rep;
do{
System.out.println("diabète 1:oui et 0:non");
rep=sc.nextInt();
}
while(rep<0|rep>1);
if(rep==1){this.diabete=true;}
else {this.diabete=false;}
this.date_compte=now();
}
//Les informations relatives au patient   
    @Override
    public String toString()
    {String s;
     s=this.CIN+"\t"+this.nom+"\t"+this.gs+"\t"+this.rs+"\t";
        if (this.diabete){s=s+"Diabétique";}
        else{s=s+"non Diabétique";}
        return s+"\t"+this.date_compte.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));}

    
 

}
    

