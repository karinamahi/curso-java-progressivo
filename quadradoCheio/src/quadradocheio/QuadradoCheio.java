/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadradocheio;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class QuadradoCheio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprime um quadrado de acordo com o número digitado pelo 

        int qtde,
                altura = 0,
                largura = 0;
               

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 20: ");
        qtde = entrada.nextInt();

        if ((qtde <= 0) || (qtde > 20)) {
            return;
        }

        while (altura < qtde) {
            while (largura < qtde) {
                System.out.print("X");
                //System.out.print(largura);
                largura++;
            }
            largura=0;
            //System.out.println(largura);
            System.out.println("");
            altura++;
        }
    }

}
