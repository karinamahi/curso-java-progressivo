package equacaosegundograu;

import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static int delta(int a, int b, int c) {
        int delta;
        delta = (b * b) - (4 * a * c);
        return delta;
    }

    public static boolean isPositive(int num) {
        boolean positivo = false;
        if (num >= 0) {
            positivo = true;
        }
        return positivo;
    }

    public static int raizUm(int delta, int a, int b) {
        return (-b + (int) Math.sqrt(delta)) / 2 * a;
    }

    public static int raizDois(int delta, int a, int b) {
        return (-b - (int) Math.sqrt(delta)) / 2 * a;
    }

    public static boolean isZero(int num) {
        boolean nulo;
        if (num == 0) {
            nulo = true;
            return nulo;
        }
        nulo = false;
        return nulo;
    }

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int delta;
        int raiz_um;
        int raiz_dois;
        boolean nulo;
        boolean positivo;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = entrada.nextInt();

        System.out.print("Digite o valor de b: ");
        b = entrada.nextInt();

        System.out.print("Digite o valor de c: ");
        c = entrada.nextInt();

        delta = delta(a, b, c);
        System.out.printf("O valor de delta é %d\n", delta);

        positivo = isPositive(delta);
        if(positivo == false){
            System.out.println("O valor de delta é negativo.Portanto as raízes são complexas."); // falta implementar o cálculo das raízes complexas.
            return;
        }
        nulo = isZero(delta);
        if (nulo == true) {
            raiz_um = raizUm(delta, a, b);
            System.out.printf("x' = x'' = %d\n", raiz_um);
            
        } else {
            raiz_um = raizUm(delta, a, b);
            System.out.printf("x'= %d\n", raiz_um);

            raiz_dois = raizDois(delta, a, b);
            System.out.printf("x''= %d\n", raiz_dois);
        }
    }

}
