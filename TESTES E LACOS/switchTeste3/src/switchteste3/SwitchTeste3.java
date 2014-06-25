/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switchteste3;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class SwitchTeste3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char vogal;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite uma vogal: ");
        vogal = entrada.nextLine().charAt(0);
        
        switch (vogal){
            case 'a': case 'A':
                System.out.println("Você digitou 'a' ou 'A'.");
                break;
            case 'e': case 'E':
                System.out.println("Você digitou 'e' ou 'E'.");
                break;
            case 'i': case 'I':
                System.out.println("Você digitou 'i' ou 'I'.");
                break;
            case 'o': case 'O':
                System.out.println("Você digitou 'o' ou 'O'.");
                break;
            case 'u': case 'U':
                System.out.println("Você digitou 'u' ou 'U'.");
                break;
            default:
                System.out.println("Você não digitou uma vogal!");
        }
                
    }
    
}
