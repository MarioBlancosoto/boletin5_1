/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

import java.util.Scanner;


public class Boletin5_2 {


    public static void main(String[] args) {
       short num1,num2;
        
       Scanner num = new Scanner(System.in);
  
       num1= num.nextShort();
       num2= num.nextShort();
       
       if (num1>=num2)
        System.out.println( "a resta  e " +(num1-num2));
        System.out.println("a suma e "+(num1+num2));
        System.out.println(" adios ");
    }
    
}
