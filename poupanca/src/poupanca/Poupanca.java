/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poupanca;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class Poupanca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // calcula o rendimento da poupança + invesntimento mensal
       
        float valor_i, montante,deposito_mensal, juros;
        int meses;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do depósito inicial: ");
        valor_i = entrada.nextFloat();
        System.out.print("Digite o valor do investimento mensal: ");
        deposito_mensal = entrada.nextFloat();
        System.out.print("Digite o número de meses: ");
        meses = entrada.nextInt();
        montante = valor_i;
        
       for(int n=1; n<=meses ; n++){
        montante = montante + deposito_mensal;   
        montante += ((montante*(0.5/100)));
        } 
       
        System.out.printf("O valor total na conta é de R$ %.2f\n", montante);
        System.out.printf("O rendimento no período foi de R$ %.2f\n ",(montante - (valor_i + (meses*deposito_mensal))));
    }

}
