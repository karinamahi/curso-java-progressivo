/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entrada_de_dados;

/**
 *
 * @author Karina
 */
import java.util.Scanner;
import java.util.Calendar;


public class Entrada_de_dados {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int idade;
        float preco;
        int ano;
                      
        //pergunta a idade e armazena        
        System.out.println("Digite sua idade: ");
        idade= entrada.nextInt();
        
        //Criando um objeto do tipo Calendar, o 'calendario' e armazenando o ano atual
        Calendar calendario = Calendar.getInstance();
                 
        System.out.printf("Você nascem em " +((calendario.get(Calendar.YEAR)) -idade)+"\n" );
        
        //Pergunta o preço e armazena
        System.out.println("Quanto custa algo numa loja de R$ 1,99?");
        preco=entrada.nextFloat();
        
        System.out.println("Hã?? "+ preco +" ?");
        
        //pergunta o ano de nascimento
        System.out.println("Digite o ano em que você nasceu: ");
        ano= entrada.nextInt();
        System.out.println("Você tem " +((calendario.get(Calendar.YEAR))- ano) +" anos de idade");
        
               
        // TODO code application logic here
    }
    
}
