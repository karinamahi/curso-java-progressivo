
package probabilidadedado;

import java.util.Random;
import java.util.Scanner;

public class ProbabilidadeDado {

    public static double dado(){
        Random entrada = new Random();
        final int high = 7;
        final int low = 1;
        return (entrada.nextInt(high - low) + low);
    }
    
    public static void main(String[] args) {
        int num;
        int move;//jogada da vez
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quantas vezes você quer lançar o dado? ");
        num = entrada.nextInt();
        
        for (int count=0; count < num; count ++){
            move = (int) dado();
           // System.out.print(move + "  ");
            if(move==1){
                count1 += 1;
            }
            if(move==2){
                count2 += 1;
            }
            if(move==3){
                count3 += 1;
            }
            if(move==4){
                count4 +=1 ;
            }
            if(move==5){
                count5 +=1 ;
            }
            if(move==6){
                count6 +=1;
            }
        }
        System.out.printf("\n1 = %d\n", count1);
        System.out.printf("2 = %d\n", count2);
        System.out.printf("3 = %d\n", count3);
        System.out.printf("4 = %d\n", count4);
        System.out.printf("5 = %d\n", count5);
        System.out.printf("6 = %d\n", count6);
    }
    
}
