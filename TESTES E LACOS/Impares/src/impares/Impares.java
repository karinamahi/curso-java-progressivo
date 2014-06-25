/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impares;

/**
 *
 * @author Karina Mayumi Hirata Bueno
 */
public class Impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programa mostra todos os números ímpares de 1 a 100
        int inicial=1,
            valor_max=99,
            razao=2,
            n=inicial;
        
        System.out.printf("Números ímpares de %d a %d\n", inicial, valor_max);
        while(n<=valor_max){
            System.out.println(n);
            n+=razao;
        }
                        
            
    }
    
}
