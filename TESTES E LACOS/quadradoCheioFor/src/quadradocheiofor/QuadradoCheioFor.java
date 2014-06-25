/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quadradocheiofor;

/**
 *
 * @author Karina
 */import java.util.Scanner;

public class QuadradoCheioFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 20: ");
        num = entrada.nextInt();
        if((num<=0)||(num>20)){
            System.out.println("Número inválido.");
            return;
        }
        for(int altura=1; (altura<=num); altura ++ ){

            for (int largura=1; (largura<=num); largura ++){
                System.out.print("X");
            }
                System.out.println("");
        }
        
    }
    
}
