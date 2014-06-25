/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parouimparfor;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class ParouimparFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número maior que zero: ");
       
        for(int numero =  entrada.nextInt(),par=0, impar=1, razao = 2; (par<numero);par += razao, impar +=razao){
            System.out.printf("%d\t %d\n", par, impar);
        }
    }
    
}
