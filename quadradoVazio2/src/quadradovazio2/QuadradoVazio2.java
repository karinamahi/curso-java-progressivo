/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadradovazio2;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class QuadradoVazio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int qtde,
                largura = 0,
                altura = 0,
                primeira = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        qtde = entrada.nextInt();
        altura++;
        largura++;
        // verificar se qtde = valido
        if ((qtde<=0)||(qtde>20)){
            System.out.println("Número inválido. Reinicie a aplicação.");
        }
        else{
        while (altura == primeira) { //linha superior


            while (largura <= qtde) {
                System.out.print("X");
                largura++;
            }
            altura++;
            largura = 1;
            System.out.println("");
        }

            while (altura < qtde) { //linhas intermediarias
            System.out.print("X");
            largura++;

                while (largura < qtde) {
                System.out.print(" ");
                largura ++ ;
                }
                largura =1;
                System.out.print("X");
                System.out.println("");
                altura ++ ;
           }
            altura = 1 ;
            
        while (largura <= qtde) {
            System.out.print("X");
            largura++;
        }
        System.out.println("");
    }
    }     

}
