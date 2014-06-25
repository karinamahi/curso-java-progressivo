/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maior;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Maior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Aplicativo que imprime o maior número dentre 10 escolhidos pelo usuário
        
        
        int num,
            maior=0,
            razao=1,
            ordem=1;
        
       
        while(ordem<=10){
            
        Scanner entrada = new Scanner(System.in);       
        System.out.printf("Digite o %d° número: \n",ordem); 
        num= entrada.nextInt();
        
        ordem +=razao;
        
        if(num>maior){
            maior=num;
        }
                
        }
        System.out.printf("O maior número entre os números digitados é o %d\n", maior);
        
        
    }
    
}
