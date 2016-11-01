
package boletin5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class Boletin5_2 {

 
    public static void main(String[] args) {
        
        short num1, num2;
        num1 = Short.parseShort(JOptionPane.showInputDialog("Introduce un número"));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Introduce un número"));
        int suma;
        suma = num1+num2;
        int resta;
        resta = num1-num2;
        
        if(num1>=num2){
            System.out.println("El resultado de la resta es " +resta);
            System.out.println("El resultado de la suma es " +suma);
        }
        else{
            System.out.println("El resultado de la suma es "+suma);
                    
        }    
    }
    
}