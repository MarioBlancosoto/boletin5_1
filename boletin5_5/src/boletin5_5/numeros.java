
package boletin5_5;

import javax.swing.JOptionPane;


public class numeros {
    
    private int num1,num2,num3;
    
    
    
    public numeros(){
        
        num1=0;
        num2=0;
        num3=0;
    }
    
    public numeros(int num1,int num2,int num3){
        
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public void setNum1() {
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o num 1 "));
    }

    public void setNum2() {
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o num 2 "));
    }

    public void setNum3() {
        this.num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o num 3 "));
    }
    
    public void numeromayor(){
        
        if(num1>num2&num1>num3){
            System.out.println("o primeiro número e maior ");
        }
        
        else if (num2>num1&num2>num3){
            
            System.out.println("o segundo número e o maior ");
        }
        
        else if(num3>num2&num3>num1) {
            System.out.println("o número 3 e o maior ");
        }
        
        else 
            System.out.println(" son iguais ");
    }


    
}
