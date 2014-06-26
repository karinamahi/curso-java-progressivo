package dado;

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
