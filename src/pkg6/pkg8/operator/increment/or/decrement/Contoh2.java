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
public class Contoh2 {
    public static void main(String args[]){
        int input,i, j, k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bilangan baris piramid terbalik : ");
        input = scan.nextInt();
        
        for(i=input;i>=1;i--){
            for(j=input;j>i;j--){
                System.out.print("");
        }
        for(k=1;k<(i*2);k++){
        System.out.print("1");
        }
        System.out.println();
        }
    }
}
