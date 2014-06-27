package patinhosfor;

import java.util.Scanner;

public class PatinhosFor {

    public static void main(String[] args) {
        int inicio;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número maior que zero: ");
        inicio = entrada.nextInt();

        if ((inicio <= 0) || (inicio > 20)) {
            System.out.println("Número inválido. Reinicie o programa.");
        } else {

            for (int foram = inicio, voltaram; foram > 0; foram--) {

                voltaram = foram - 1;
                System.out.println("");
                System.out.printf("%d patinhos foram passear\n", foram);
                System.out.println("Além das montanhas para brincar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá!");
                System.out.printf("Mas só %d patinhos voltaram de lá.\n", voltaram);
            }
            System.out.println("");
            System.out.println("A mamãe patinha foi procurar");
            System.out.println("Além das montanhas");
            System.out.println("Na beira do mar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá!");
            System.out.printf("E os %d patinhos voltaram de lá!\n", inicio);
        }
    }
}
