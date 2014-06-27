package parouimparfor;

import java.util.Scanner;

public class ParouimparFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número maior que zero: ");
       
        for(int numero =  entrada.nextInt(),par=0, impar=1, razao = 2; (par<numero);par += razao, impar +=razao){
            System.out.printf("%d\t %d\n", par, impar);
        }
    }
}
