/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatorial;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, fatorial;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        fatorial =n;
        
        for (int razao=n-1 ; razao>0 ; razao-- ){
            fatorial = fatorial*razao;
        }
        System.out.printf("%d! = %d\n", n, fatorial);
    
    }
}
