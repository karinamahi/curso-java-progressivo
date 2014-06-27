package diamante;

import java.util.Scanner;

public class Diamante {

    public static void main(String[] args) {
        int n;
        int razao = 2;
        int count = 1;
        int count_cheio = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número ímpar: ");
        n = entrada.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("Você não digitou um número ímpar.");
            return;
        }
        for (int altura = 0; altura <n; altura++) {
            if (altura < ((n / 2) + (1 / 2))) {
                for (int vazio = ((n / 2) - (1 / 2) - count); vazio >= 0; vazio--) {
                    System.out.print(" ");
                }
                for (int cheio = 0; (cheio < count_cheio) && (cheio < n); cheio++) {
                    System.out.print("X");
                }
                System.out.println("");
                count++;
                count_cheio += 2;
            } 
            
            else 
                {
                if (altura == ((n / 2) + (1 / 2))) {
                    for (int cheio = 0; cheio < n; cheio++) {
                        System.out.print("X");
                    }
                    System.out.println("");
                }
                for (int vazio = 0; ((vazio<count-n/2) && (vazio<n/2)); vazio++) {
                    System.out.print(" ");
                }
                for (int cheio = n-2; cheio>n-count_cheio; cheio--) {
                    System.out.print("X");
                }
                System.out.println("");
                count++;
                count_cheio -= 2;
            }
        }
    }
}

