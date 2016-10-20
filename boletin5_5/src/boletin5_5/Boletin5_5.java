
package boletin5_5;

import javax.swing.JOptionPane;


public class Boletin5_5 {


    public static void main(String[] args) {
      
        int num1,num2,num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("introduzca o primeiro numero "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(" introduzca o segundo número "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(" introduzca o terceiro número "));
        
        if (num1>num2&num1>num3){
            System.out.println(" el numero 1 es el mayor ");
           

        }
        
        else if (num2>num1&num2>num3){
            System.out.println(" el numero 2 es el mayor ");
        
        }
        else{
        System.out.println(" el numero 3 es el mayor ");
        }
        
    
        }
       
            }
    

     
    

