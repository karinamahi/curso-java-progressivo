/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maiorfor;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class MaiorFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int maior=0;
        
        for (int num, ordem=1; ordem<=10; ordem ++ ){
            System.out.printf("Digite o %d° número: ", ordem);
            num =  entrada.nextInt();
            
            if (num>maior){
                maior = num;
            }
                                   
        }
        System.out.println("Dentre os números digitados " + maior + " é o maior!");
    }
    
}
