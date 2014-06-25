/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imc;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Imc {
    
    public static float calculaIMC(float peso, float altura){
        float imc;
        imc = peso /(altura*altura);
        return imc;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso, altura, imc;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com seu peso, em kilos: ");
        peso = entrada.nextFloat();
        
        System.out.print("Entre com sua altura, em metros: ");
        altura = entrada.nextFloat();
        
        imc = calculaIMC(peso, altura);
        
        System.out.printf("Seu IMC vale: %.2f\n", imc);
        
    }
    
}
