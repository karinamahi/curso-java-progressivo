package produtodosnumeros;

import java.util.Scanner;

public class ProdutoDosNumeros {

    public static void main(String[] args) {
        int n;
        long pares=1;
        long impares=1;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        n = entrada.nextInt();
        
        for(int count=1; count<=n; count++){
            if(count%2==0){
                pares *= count;
            }
            else{
                impares *=count;
            }
        }
        System.out.printf("O produto dos números pares entre 1 e %d é: %d. O produto dos números impares entre 1 e %d é %d.\n", n ,pares ,n ,impares);
    }
}
