
package nulo;

import java.util.Scanner;

public class Nulo {

    public static boolean isZero(float num){
        boolean nulo;
        
            if(num==0){
                nulo = true;
                return nulo;
            }
            nulo = false;
            return nulo;
    } 
    
    public static void main(String[] args) {
        float num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = entrada.nextFloat();
        
        if(isZero(num)==true){
            System.out.println("O número digitado é nulo.");
        }
        else{
            System.out.println("O número digitado não é nulo.");
        }
    }
    
}
