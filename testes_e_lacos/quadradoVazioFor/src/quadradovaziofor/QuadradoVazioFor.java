package quadradovaziofor;

import java.util.Scanner;

public class QuadradoVazioFor {

    public static void main(String[] args) {

        int num;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if ((num <= 0) || (num > 20)) {
            System.out.println("Número inválido. Reinicie.");
            return;
        }

        for (int primeira = 1, altura = 1; altura <= num; altura++) {
            if (altura == primeira) {
                for (int largura = 1; largura <= num; largura++) {
                    System.out.print("X");
                }
                System.out.println("");
            } else {
                if (altura != num) {
                    System.out.print("X");
                    for (int largura = 2; largura < num; largura++) {
                        System.out.print(" ");
                    }
                    System.out.println("X");
                } else {
                    for (int largura = 1; largura <= num; largura++) {
                        System.out.print("X");
                    }
                    System.out.println("");
                }
            }
        }
    }
}
