/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switchteste2;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class SwitchTeste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char vogal;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite uma vogal minúscula: ");
        vogal = entrada.nextLine().charAt(0);
        
        switch (vogal)
        {
            case 'a':
                System.out.println("Você está no case da vogal 'a'.");
            case 'e':
                System.out.println("Você está no case da vogal 'e'.");
            case 'i':
                System.out.println("Você está no case da vogal 'i'.");
            case 'o':
                System.out.println("Você está no case da vogal 'o'.");
            case 'u':
                System.out.println("Você está no case da vogal 'u'.");
            default :
                System.out.println("Você não digitou uma vogal minúscula.");
        }
                
    }
    
}
