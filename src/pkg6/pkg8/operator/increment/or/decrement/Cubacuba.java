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
public class Cubacuba {
   public static void main(String[] args){
       int w=1, x=1, y=1, z=1;
       int a = w++;
       int b = ++x;
       int c = y--;
       int d = --z;
       System.out.println("Post Increment a= "+a+" w = "+w);
       System.out.println("Post Increment b= "+b+" x = "+x);
       System.out.println("Post Increment c= "+c+" z = "+y);
       System.out.println("Post Increment d= "+d+" y = "+z);
   } 
}
