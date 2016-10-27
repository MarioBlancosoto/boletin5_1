
package boletin5_7;

import javax.swing.JOptionPane;


public class Boletin5_7 {


    public static void main(String[] args) {
        int select;

        Figuras obj = new Figuras();
  
        
       
        

             
           select = Integer.parseInt(JOptionPane.showInputDialog("\n teclea 1 para el circulo \n teclea 2 para el cuadrado \n teclea 3 para el triangulo \n teclea 0 para salir "));
                 
      switch(select){
          
          case 1 : obj.circulo(0);
          break;
          case 2 : obj.cuadrado(0);
          break;
          case 3 : obj.triangulo(0, 0);
          break;
              
          default:
              JOptionPane.showMessageDialog(null, "Error,seleccione otro número ");
      }
    } 
 
      
    
}
