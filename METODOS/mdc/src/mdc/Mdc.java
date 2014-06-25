package mdc;

import java.util.Scanner;

public class Mdc {

    public static boolean par(int num) {
        boolean par = false;
        if (num % 2 == 0) {
            par = true;
        }
        return par;
    }

    public static boolean isPrimo(int num) {
        if (num == 2) {
            return true;
        }
        if (par(num)) {
            return false;
        }

        int restoZero = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                restoZero++; // conta quantas vezes o resultado da divisão de num/i foi igual a zero.
            }
        }
        if (restoZero == 2) { // para ser primo,o resultado de num/i pode obter resto zero apenas duas vezes: quando dividido por 1 ou por ele mesmo. 
            return true;
        }
        return false;
    }

    public static int calculaMDC(int num1, int num2) {
        int mdc = 1;
                
        for (int i = 0; i < num1 || i < num2; i++) {
            if (isPrimo(i)) {
                //System.out.println(i);
                 int primeiro = num1;
                  int segundo = num2;
       
                while (primeiro % i == 0 && segundo % i == 0) {
                    mdc *= i;
                    primeiro = primeiro/i;
                    segundo = segundo/i;
                }
            }

        }
        return mdc;
    }

    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.println(calculaMDC(numero1, numero2));
    }
}