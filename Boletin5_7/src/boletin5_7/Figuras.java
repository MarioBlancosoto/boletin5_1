
package boletin5_7;

import javax.swing.JOptionPane;


public class Figuras {
    private int lado,base,altura,radio,triangulo,cuadrado,circulo,select;
    private final double pi=3.14;
    
    
    
    public Figuras(){
        
        
    }
    
    public Figuras(int lado,int base,int altura,int radio){
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
       
    }
    
    
    
    public void cuadrado(int lado){
        lado = Integer.parseInt(JOptionPane.showInputDialog(" inserte el lado"));
        JOptionPane.showMessageDialog(null,"el area del cuadrado es " +lado*lado);
    }
    
    public void circulo (int radio){
        radio = Integer.parseInt(JOptionPane.showInputDialog(" Inserte el radio "));
        JOptionPane.showMessageDialog(null," el area de la circunferencia es "+ pi*Math.pow(radio,2));
    }
    
    
    public void triangulo(int base,int altura){
        base = Integer.parseInt(JOptionPane.showInputDialog(" inserte la base "));
        altura = Integer.parseInt(JOptionPane.showInputDialog(" Inserte la altura " ));
        JOptionPane.showMessageDialog(null," el area del triangulo es "+ (base*altura)/2);
        
    }
            
            

       }
  

    
    
    
    

