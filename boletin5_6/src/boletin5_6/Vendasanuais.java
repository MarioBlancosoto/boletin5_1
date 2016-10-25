
package boletin5_6;

import javax.swing.JOptionPane;


public class Vendasanuais {
    
    private int productos;
    
    
    
    public Vendasanuais (){
        productos = 0;
    }
    
    public Vendasanuais(int productos){
        
        this.productos= productos;
    }

    public void setProductos() {
        this.productos = Integer.parseInt((JOptionPane.showInputDialog("Introduza a cantidade de producto")));
    }
    
    
   public void Vendas (){
       
       if (productos <= 100){
           System.out.println(" o artigo de consumo e baixo ");
       }
       else if(productos>100&&productos<500){
       System.out.println(" o artigo de consumo e medio ");
   }
       else if(productos <=100){
           System.out.println(" o producto e alto ");
       }
       else 
           System.out.println("o producto e de primeira necesidade ");
   } 
    
    
}
