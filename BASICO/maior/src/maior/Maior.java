
package maior;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        int num,
            maior=0,
            razao=1,
            ordem=1;
       
        while(ordem<=10){
            
        Scanner entrada = new Scanner(System.in);       
        System.out.printf("Digite o %d° número: \n",ordem); 
        num= entrada.nextInt();
        
        ordem +=razao;
        
        if(num>maior){
            maior=num;
        }
        }
        System.out.printf("O maior número entre os números digitados é o %d\n", maior);
    }
    
}
