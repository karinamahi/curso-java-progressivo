package switchteste4;

import java.util.Scanner;

public class SwitchTeste4 {

    public static void main(String[] args) {
        float valor_i, valor_f, juros=0;
        int meses;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual o valor inicial da sua dívida: ");
        valor_i = entrada.nextFloat();
        System.out.println("Você vai atrasar quantos meses [0-5] ?");
        meses = entrada.nextInt();
        
        switch (meses){
                case 5:
                    juros++;
                case 4:
                    juros++;
                case 3: 
                    juros ++;
                case 2:
                    juros ++;
                case 1:
                    juros ++;
                    break;
                default:
                    System.out.println("Você não digitou um valor válido de meses.");
        }
        System.out.println("Juros = " + juros + "%");
        valor_f = ((1 + (juros/100))* valor_i);
        System.out.printf("Valor final da dívida: R$ %.2f\n", valor_f);
    }
}
