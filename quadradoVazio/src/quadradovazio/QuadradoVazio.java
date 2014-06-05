/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadradovazio;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class QuadradoVazio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprime um quadrado vazio de acordo com o número informado pelo usuário

        int qtde,
                linhasup = 0,
                linhainf = 0,
                linhadir = 0,
                linhaesq = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 20: ");
        qtde = entrada.nextInt();

        if ((qtde <= 0) || (qtde > 20)) {
            return;
        }
        while (linhaesq < qtde) {
            while (linhasup < qtde) {
                System.out.print("X");
                linhasup++;
            }
            linhaesq++;
            //linhasup = 0;
           // System.out.println("");
            if (linhaesq != qtde) {
                while (linhaesq < qtde) {
                    System.out.println("");
                    System.out.print("X");
                    linhaesq++;
                }
                    while ((linhainf)<(qtde-1)){
                        System.out.print("X");
                        linhainf ++;
                    }
                
            }

            //System.out.println("X");
            
        }
    }
}
