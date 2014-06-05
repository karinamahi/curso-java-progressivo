/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doismaiores;

/**
 *
 * @author Karina
 */

import java.util.Scanner;

public class DoisMaiores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa que imprime os dois maiores números entre os digitados pelo ususário
        
        int num,
              maior1=-20000,
              maior2=-20000;
        int count=1;
        
        while(count<=10){
            
            Scanner entrada = new Scanner(System.in);
            System.out.printf("Digite o %d° número: \n",count);
            num = entrada.nextInt();
            count ++;
            
            if(num>maior1){
                maior2=maior1;
                maior1=num;
                
            }
            else
                if(num>maior2){
                    maior2=num;
                }
            
        }
              System.out.printf("Dentre os números digitados, o maior é o " + maior1+" e o segundo maior é o " + maior2 + "\n");
              
        
           
        
    }
    
}
