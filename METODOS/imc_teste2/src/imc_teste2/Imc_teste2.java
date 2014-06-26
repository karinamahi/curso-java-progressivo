
package imc_teste2;

import java.util.Scanner;

public class Imc_teste2 {

    public static void main(String[] args) {
        float peso, altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com seu peso, em quilos: ");
        peso = entrada.nextFloat();
        
        System.out.print("Entre com sua altura, em metros: ");
        altura = entrada.nextFloat();
        
        System.out.printf("Seu IMC vale: %.2f\n", calculaIMC(peso , altura));
    }
    
    public static float calculaIMC(float peso, float altura){
        return peso/quadrado(altura);
    } 
    
    public static float quadrado(float num){
        return num*num;
    }
    
}
