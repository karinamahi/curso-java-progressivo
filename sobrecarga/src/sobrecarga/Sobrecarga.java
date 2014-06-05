/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sobrecarga;

/**
 *
 * @author Karina
 */
public class Sobrecarga {

    public static int quadrado(int num){
        int quadrado;
        quadrado = num*num;
        return quadrado;              
    }
    
    public static double quadrado(double num){
        double quadrado;
        quadrado = num*num;
        return quadrado;
    }
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inteiro 2 ao quadrado: " + quadrado(2));
        System.out.println("Double PI ao quadrado: " + quadrado(Math.PI));
    }
    
}
