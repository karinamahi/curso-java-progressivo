package parouimpar;

import java.util.Scanner;

public class Parouimpar {

    public static void main(String[] args) {
        int n,
                inicio = 0,
                razao = 2,
                pares = inicio;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número positivo: ");
        n = entrada.nextInt();

        System.out.printf("Os números pares de zero a %d são: \n", n);
        pares += razao;
        while (pares <= n) {
            System.out.println(pares);
            pares += razao;
        }

        int impares = 1;
        System.out.printf("Os números ímpares de zero a %d são: \n", n);
        while (impares <= n) {
            System.out.println(impares);
            impares += razao;
        }
    }
}
