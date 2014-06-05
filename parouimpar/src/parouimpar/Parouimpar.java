/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parouimpar;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Parouimpar{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa solicita um número ao usuário e imprime os números pares e impares separadamente.
        int n,
            inicio=0,
            razao=2,   
            pares=inicio;
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número positivo: ");
        n = entrada.nextInt();
        
        System.out.printf("Os números pares de zero a %d são: \n",n);
                pares+=razao;
        while(pares<=n){
                System.out.println(pares);
                pares +=razao;
                }
        
        int impares=1;
        
         System.out.printf("Os números ímpares de zero a %d são: \n",n);
         while (impares<=n){
                 System.out.println(impares);
                 impares +=razao;
             
         }   
       
        
        // TODO code application logic here
    }
    
}
