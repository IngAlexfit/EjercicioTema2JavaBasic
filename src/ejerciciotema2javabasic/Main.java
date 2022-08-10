/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema2javabasic;

/**
 *
 * @author Ing_Puello
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double result=calcuIva(20000);
        System.out.println("el precio total con el iva es: "+result);
        
    }
    
    
    static double calcuIva(double precio){
        final double iva=0.19;
        double result=0;
        result=precio+(iva*precio);
        
        return result;
    }
}
