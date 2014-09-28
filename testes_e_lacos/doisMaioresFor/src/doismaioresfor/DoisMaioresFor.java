package doismaioresfor;

import java.util.Scanner;

public class DoisMaioresFor {

    public static void main(String[] args) {

        int maior1 = 0,
                maior2 = 0;
        Scanner entrada = new Scanner(System.in);

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
