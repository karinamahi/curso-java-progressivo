/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package media;

/**
 *
 * @author Karina
 */
import java.util.Scanner;
        
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        
        System.out.print("Digite a primeira nota: ");
        nota1= entrada.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextFloat();
        
        System.out.print("Digite a quarta nota: ");
        nota4 = entrada.nextFloat();
        
        System.out.println("Sua média é " + (((nota1+nota2)+(nota3+nota4))/4));
               
              
        // TODO code application logic here
    }
    
}
