package matrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        boolean continuar = true;
        char opcao;
        Scanner entrada = new Scanner(System.in);
        
        while(continuar){
            System.out.println("Você está na matrix!");
            System.out.print("Digite um caractere para sair da matrix: ");
            opcao = entrada.next().charAt(0);
            
            if (opcao=='j'){
                continuar = false;
                System.out.println("Parabéns, você conseguiu sair da matrix!");
            }
            else{
                System.out.println("Você não está autorizado a sair da Matrix. Estude Java");
            }
        }
    }
}
