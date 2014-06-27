package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        int n, fatorial;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        fatorial =n;
        
        for (int razao=n-1 ; razao>0 ; razao-- ){
            fatorial = fatorial*razao;
        }
        System.out.printf("%d! = %d\n", n, fatorial);
    }
}
