
package boletin5_4;

import java.util.Scanner;


public class Boletin5_4 {

   
    public static void main(String[] args) {
    
       int persona1,persona2;
       Scanner pesar = new Scanner(System.in);
       persona1 = pesar.nextInt();
       persona2 = pesar.nextInt();
       
       if (persona1>persona2)  {
           
       System.out.println(" a persoa 1 pesa " + (persona1-persona2)+" kg más que la persona 2 ");
      
       }        
       else if(persona2>persona1){
        System.out.println(" a persona 2 pesa " + (persona2-persona1)+" kg más que la persona 1 ");
    }
        else
           System.out.println(" as persoas pesan o mesmo " );
    }
    
}
