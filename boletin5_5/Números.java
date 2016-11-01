package boletin5_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Números {
    
    private int num1,num2,num3;
    
    
    
    public Números(){
        

    }
    
    public Números(int num1,int num2,int num3){
        
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public void setNum1() {
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número "));
    }

    public void setNum2() {
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número "));
    }

    public void setNum3() {
        this.num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número"));
    }
    
    public void numeromayor(){
        
        if(num1>num2&&num1>num3){
            System.out.println("el primer número es el mayor ");
        }
        
        else if (num2>num1&&num2>num3){
            
            System.out.println("el segundo número es el mayor ");
        }
        
        else if(num3>num2&&num3>num1) {
            System.out.println("el tercer número es el mayor ");
        }
        
        else 
            System.out.println(" son iguales ");
    }
}
