
package maiordedois;

import java.util.Scanner;

public class MaiorDeDois {
    
    public static int Maior(int num1,int num2){
        int maior;
        
        if (num1>num2){
            maior=num1;
            return maior;
        }
        maior = num2;
        return maior;
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.printf("%d é o número maior.\n", Maior(num1, num2));
    }
    
}
