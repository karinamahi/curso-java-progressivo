/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package delta;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Delta {

    public static int delta(int a, int b, int c){
        int delta;
        delta = (b*b)-(4*a*c);
        return delta;
    }    
    
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        a = entrada.nextInt();
        
        System.out.print("Digite o valor de b: ");
        b = entrada.nextInt();
        
        System.out.print("Digite o valor de c: ");
        c = entrada.nextInt();
        
        System.out.printf("O valor de delta é %d\n", delta(a, b, c));
    }
    
}
