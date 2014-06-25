/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathtestimc;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class MathTestIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso, altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com seu peso, em quilos: ");
        peso = entrada.nextFloat();
        
        System.out.print("Entre com sua altura, em metros: ");
        altura = entrada.nextFloat();
        
        System.out.printf("O valor do IMC é = %.2f\n", calculaIMC(peso , altura));       
    }
    
    public static float calculaIMC(float peso, float altura){
        return peso/(float)Math.pow(altura, 2);
    }
    
    public static float quadrado(float num){
        return (float)Math.pow(num, 2);
    }
    
}
