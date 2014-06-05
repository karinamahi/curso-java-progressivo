/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaparametrosmedia;

/**
 *
 * @author Karina
 */

import java.util.Scanner;


public class ListaParametrosMedia {
    
    public static float media(float...valores){
        float media = 0;
            
            for(float valor: valores){
                media +=valor;
    }
            return media/valores.length;
}
               

    public static void main(String[] args) {
        float valor1, valor2, valor3, valor4, valor5;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o valor 1: ");
        valor1 = entrada.nextFloat();
        
        System.out.print("Entre com o valor 2: ");
        valor2 = entrada.nextFloat();
        
        System.out.print("Entre com o valor 3: ");
        valor3 = entrada.nextFloat();
        
        System.out.print("Entre com o valor 4: ");
        valor4 = entrada.nextFloat();
        
        System.out.print("Entre com o valor 5: ");
        valor5 = entrada.nextFloat();
        
        System.out.printf("A média dos valores é = %.2f\n", media(valor1, valor2,valor3, valor4, valor5));
        System.out.printf("A media dos quatro primeiros valores é = %.2f\n", media(valor1, valor2, valor3, valor4 ));
        System.out.printf("A média dos três primeiros valores é = %.2f\n", media(valor1, valor2, valor3));
        System.out.printf("A média dos dois primeiros valores é + %.2f\n", media(valor1, valor2));
    }
    
}
