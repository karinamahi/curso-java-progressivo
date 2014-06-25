/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doismaioresfor;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class DoisMaioresFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int maior1 = 0,
                maior2 = 0;

        for (int num, ordem = 1; (ordem <= 10); ordem++) {
            System.out.printf("Digite o %d° número: ", ordem);
            num = entrada.nextInt();

            if (num > maior1) {
                maior1 = num;
            } else {
                if (num > maior2) {
                    maior2 = num;
                }
            }

        }
        System.out.printf("Dentre os números digitados, %d é o maior e %d é o segundo maior. ", maior1, maior2);

    }

}
