/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menorentredois;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class MenorEntreDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,
                pares=1,
                impares=1;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número desejado: ");
        n = entrada.nextInt();
        
        for(int count=1; count<=n; count++){
            if(count%2==0){
                pares *= count;
            }
            else{
                impares *=count;
            }
        }
        System.out.printf("O produto dos números pares entre 1 e %d é: %d. O produto dos números impares entre 1 e %d é %d.", n ,pares ,n , impares);
        
    }
    
}
