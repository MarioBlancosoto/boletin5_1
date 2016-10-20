/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

import java.util.Scanner;

/**
 *
 * @author oracle
 */
public class Boletin5_3 {


    public static void main(String[] args) {
       int num1;
       
       Scanner mostra = new Scanner(System.in);
       num1 = mostra.nextInt();
    
       
       if(num1>=1) {
        
       
          System.out.println("+");
                             
    
    }              
              
       else if (num1<0){
        
        System.out.println("-");
        
        
    }  
    
       else{
        System.out.println("0");
    }
    }
}
