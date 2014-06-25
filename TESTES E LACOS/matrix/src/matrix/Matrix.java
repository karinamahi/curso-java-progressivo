/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean continuar = true;
        char opcao;
        Scanner entrada = new Scanner(System.in);
        
        while(continuar){
            System.out.println("Você está na matrix!");
            System.out.print("Digite um caractere para sair da matrix: ");
            opcao = entrada.next().charAt(0);
            
            if (opcao=='j'){
                continuar = false;
                System.out.println("Parabéns, você conseguiu sair da matrix!");
            }
            else{
                System.out.println("Você não está autorizado a sair da Matrix. Estude Java");
            }
        }
        
    }
    
}
