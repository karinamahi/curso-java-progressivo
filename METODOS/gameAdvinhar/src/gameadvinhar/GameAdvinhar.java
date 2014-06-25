package gameadvinhar;

import java.util.Random;
import java.util.Scanner;

public class GameAdvinhar {

    public static void dica(int palpite, int numero, int tentativas){
        if(palpite>numero){
            System.out.println("Seu palpite é maior que o número sorteado.");
        }else{
            if(palpite<numero){
                System.out.println("Seu palpite é menor que o número sorteado. ");
            }
            else{
                System.out.println("Parabéns, você acertou! o número era " + numero);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
            }
        }
    }
    public static void main(String[] args) {
        int sorteado;
        int palpite = 0;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);
        
        Random geradorDeAleatorios = new Random();
        sorteado = geradorDeAleatorios.nextInt(1000)+1;
        System.out.println("Um número entre 1 e 1000 foi sorteado!");
        
        do{
            System.out.printf("\n\n\n\n-----------------------\n");
            System.out.println("Número de tentativas: " + tentativas);
            
            System.out.print("Qual o seu palpite: ");
            palpite = entrada.nextInt();
            
            tentativas ++;
            
            dica(palpite, sorteado, tentativas);
            
        }while (palpite != sorteado);
    }
    
}
