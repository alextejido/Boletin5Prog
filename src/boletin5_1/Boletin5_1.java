package boletin5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class Boletin5_1 {

  
    public static void main(String[] args) {
        
        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        if(num1>0)
            System.out.println("O número é positivo");
    }
    
}
