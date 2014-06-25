/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patinhos;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Patinhos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite um número para começar a música: ");
        n= entrada.nextInt();
        
        int inicial=n,    
            razao=1,
            valor_final=0;     
                    
        
        while(inicial>valor_final){
            System.out.printf("%d patinhos foram passear \nAlém das montanhas para brincar \nA mamãe gritou: Quá, quá, quá, quá \n",inicial);
            inicial -=razao; 
            System.out.printf("Mas só %d patinhos voltaram de lá \n\n",inicial );
            }
        System.out.printf("A mamãe patinha foi procurar \nAlém das montanhas \nNa beira do mar \nA mamãe gritou: Quá, quá, quá, quá \nE os %d patinhos voltaram de lá \n", n);
        

        
    }
    
}
