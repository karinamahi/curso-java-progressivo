/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maiordetres;

/**
 *
 * @author Karina
 */

import java.util.Scanner;

public class MaiorDeTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2,num3;
        int maior1;
        int maior2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = entrada.nextInt();
        
        maior1 = Math.max(num1, num2);        
        maior2 = Math.max(maior1, num3);
        
        System.out.printf("%d é o maior dos três números digitados.\n", maior2);
    }
    
}
