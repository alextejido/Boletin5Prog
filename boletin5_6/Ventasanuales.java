package boletin5_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Ventasanuales {
    
     private int productos;
    
    
    
    public Ventasanuales (){
        
    }
    
    public Ventasanuales(int productos){
        
        this.productos= productos;
    }

    public void setProductos() {
        this.productos = Integer.parseInt((JOptionPane.showInputDialog("Introduza la cantidad de producto")));
    }
    
    
   public void Ventas (){
       
       if (productos <= 100){
           System.out.println(" el articulo de consumo es bajo ");
       }
       else if(productos>100&&productos<500){
       System.out.println(" el articulo de consumo es medio ");
   }
       else if(productos <=100){
           System.out.println(" el producto es alto ");
       }
       else 
           System.out.println("el producto es de primera necesidad ");
   } 
}
