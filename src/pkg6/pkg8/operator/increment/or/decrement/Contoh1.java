/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg8.operator.increment.or.decrement;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Contoh1 {
/** Main Method */
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int nom_input, nom_asal, jawapan;
        System.out.print("Masukkan nombor untuk  ujiaan increment & decrement: ");
        
        nom_input=input.nextInt();
        System.out.println("Nombor yang dimasukkan adalah " +nom_input);
        
        nom_asal=nom_input;
        System.out.println(" ");
        jawapan = ++nom_asal;
        System.out.println("1.Operator Pre-increment nombor asal " +nom_input +" jadi " +nom_asal);
        
        nom_asal=nom_input;
        System.out.println(" ");
        jawapan = nom_asal++;
        System.out.println("2.Operator Post-increment nombor asal " +nom_input +" jadi " +nom_asal);
        System.out.println(" dan jawapanya adalah " + jawapan);
        
        nom_asal=nom_input;
        System.out.println("");
        jawapan = --nom_asal;
        System.out.println("3.Operator Pre-decrement nombor asal " +nom_input+" jadi " +nom_asal);
        System.out.println(" dan jawapanya adalah " + jawapan);
        
        nom_asal=nom_input;
        System.out.println("");
        jawapan = nom_asal--;
        System.out.println("4.Operator Post-decrement nombor asal " +nom_input+" jadi " +nom_asal);
        System.out.println(" dan jawapanya adalah " + jawapan);
    }
    
}
