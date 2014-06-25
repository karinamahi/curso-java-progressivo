package entrada_de_dados;

import java.util.Scanner;
import java.util.Calendar;

public class Entrada_de_dados {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int idade;
        float preco;
        int ano;
                      
        System.out.println("Digite sua idade: ");
        idade= entrada.nextInt();
        
        Calendar calendario = Calendar.getInstance();
                 
        System.out.printf("Você nascem em " +((calendario.get(Calendar.YEAR)) -idade)+"\n" );
        
        System.out.println("Quanto custa algo numa loja de R$ 1,99?");
        preco=entrada.nextFloat();
        
        System.out.println("Hã?? "+ preco +" ?");
        
        System.out.println("Digite o ano em que você nasceu: ");
        ano= entrada.nextInt();
        System.out.println("Você tem " +((calendario.get(Calendar.YEAR))- ano) +" anos de idade");
    }
    
}
