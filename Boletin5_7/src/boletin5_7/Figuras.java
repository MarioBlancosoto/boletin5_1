
package boletin5_7;

import javax.swing.JOptionPane;


public class Figuras {
    private float lado,base,altura,radio,triangulo,cuadrado,circulo,select;
    private final double pi=3.14;
    
    
    
    public Figuras(){
        
        
    }
    
    public Figuras(float lado,float base,float altura,float radio){
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
       
    }
    
    
    
    public void cuadrado(float lado){
        lado = Float.parseFloat(JOptionPane.showInputDialog(" inserte el lado"));
        JOptionPane.showMessageDialog(null,"el area del cuadrado es " +lado*lado);
    }
    
    public void circulo (float radio){
        radio = Float.parseFloat(JOptionPane.showInputDialog(" Inserte el radio "));
        JOptionPane.showMessageDialog(null," el area de la circunferencia es "+ pi*Math.pow(radio,2));
    }
    
    
    public void triangulo(float base,float altura){
        base = Float.parseFloat(JOptionPane.showInputDialog(" inserte la base "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(" Inserte la altura " ));
        JOptionPane.showMessageDialog(null," el area del triangulo es "+ (base*altura)/2);
        
    }
            
            

       }
  

    
    
    
    

