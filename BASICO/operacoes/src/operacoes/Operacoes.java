/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operacoes;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Operacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1;
        float num2;
        
        System.out.print("Digite o primeiro número: ");
        num1=entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2=entrada.nextInt();
     
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        
        
        
        // TODO code application logic here
    }
    
}
