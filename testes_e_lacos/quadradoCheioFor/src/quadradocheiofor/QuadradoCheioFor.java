
package quadradocheiofor;

import java.util.Scanner;

public class QuadradoCheioFor {

    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 20: ");
        num = entrada.nextInt();
        if((num<=0)||(num>20)){
            System.out.println("Número inválido.");
            return;
        }
        for(int altura=1; (altura<=num); altura ++ ){

            for (int largura=1; (largura<=num); largura ++){
                System.out.print("X");
            }
                System.out.println("");
        }
    }
}
