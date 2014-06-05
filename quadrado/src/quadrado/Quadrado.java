/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quadrado;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Quadrado {
    
    public static int quadrado(int num){
        int quadrado;
        quadrado = num*num;
        return quadrado;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int numero_quadrado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com um número inteiro: ");
        numero = entrada.nextInt();
        
        numero_quadrado = quadrado(numero);
        
        System.out.printf("%d elevado ao quadrado é %d\n", numero, numero_quadrado);
    }
    
}
