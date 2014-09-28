package quadradocheio;

import java.util.Scanner;

public class QuadradoCheio {

    public static void main(String[] args) {

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
                largura++;
            }
            largura = 0;
            System.out.println("");
            altura++;
        }
    }
}
