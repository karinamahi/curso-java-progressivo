package dowhile;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        boolean continuar = true;
        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\tMenu de opções do curso Java Progressivo: ");
            System.out.println("1. Ver o menu");
            System.out.println("2. Ler o menu");
            System.out.println("3. Repetir o menu");
            System.out.println("4. Tudo de novo");
            System.out.println("5. Não li, pode repetir?");
            System.out.println("0. Sair");

            System.out.print("\nInsira sua opção: ");
            opcao = entrada.nextInt();

            if (opcao == 0) {
                continuar = false;
                System.out.println("Programa finalizado");
            } else {
                System.out.printf("\n\n\n\n\n\n\n");
            }
        } while (continuar);
    }
}
