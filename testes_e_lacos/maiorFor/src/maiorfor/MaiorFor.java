package maiorfor;

import java.util.Scanner;

public class MaiorFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior=0;
        
        for (int num, ordem=1; ordem<=10; ordem ++ ){
            System.out.printf("Digite o %d° número: ", ordem);
            num =  entrada.nextInt();
            
            if (num>maior){
                maior = num;
            }
        }
        System.out.println("Dentre os números digitados " + maior + " é o maior!");
    }
}
