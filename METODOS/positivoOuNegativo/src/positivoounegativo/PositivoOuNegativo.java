/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package positivoounegativo;

/**
 *
 * @author Karina
 */
import java.util.Scanner;


public class PositivoOuNegativo {

    public static boolean isPositive(float num){
        boolean positivo = false;
        if(num>=0){
            positivo = true;
        }
        return positivo;
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = entrada.nextFloat();
        
        if(isPositive(num)== true){
            System.out.println("O número digitado é positivo");
        }
        else{
            System.out.println("O número digitado é negativo");
        }
    }
    
}
