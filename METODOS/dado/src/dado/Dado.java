/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

/**
 *
 * @author Karina
 */
import java.util.Random;

public class Dado {

    public static double dado() {
        Random entrada = new Random();
        final int high = 5;
        final int low = 1;
        return entrada.nextInt(high + 1) + low;
    }

    public static void main(String[] args) {
       
        System.out.println(dado());
        
             
    }

}
