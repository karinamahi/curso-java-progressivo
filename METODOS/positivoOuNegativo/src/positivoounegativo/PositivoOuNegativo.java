
package positivoounegativo;

import java.util.Scanner;

public class PositivoOuNegativo {

    public static boolean isPositive(float num){
        boolean positivo = false;
        if(num>=0){
            positivo = true;
        }
        return positivo;
    } 
    
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
