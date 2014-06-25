/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pares;

/**
 *
 * @author Karina
 */
public class Pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inicial=0,
            razao=2,
            n=inicial,
            valor_max=100;
        
        System.out.printf("Números pares de %d a %d\n",inicial, valor_max);
        while(n<=valor_max){
            System.out.println(n);
            n +=razao;
            
        }
                
                
        
        // TODO code application logic here
    }
    
}
