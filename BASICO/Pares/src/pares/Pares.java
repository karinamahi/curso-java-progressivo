package pares;

public class Pares {

    public static void main(String[] args) {
        int inicial = 0,
                razao = 2,
                n = inicial,
                valor_max = 100;

        System.out.printf("Números pares de %d a %d\n", inicial, valor_max);
        while (n <= valor_max) {
            System.out.println(n);
            n += razao;
        }
    }

}
