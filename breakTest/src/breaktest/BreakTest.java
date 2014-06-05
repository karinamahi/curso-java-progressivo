/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package breaktest;

/**
 *
 * @author Karina
 */
public class BreakTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  // calcula o tempo de execução sem o comando break    
        long i = System.currentTimeMillis();
        boolean imprimir = true;
        
        for (int count=1 ; count <= 1000000 ; count ++){
            if ((count % 17 == 0) && (count % 19 == 0)){
                if (imprimir){
                    System.out.println(count);
                    imprimir = false;
                }
            }
        }
        System.out.println("Tempo de execução, em mili-segundos: " + (System.currentTimeMillis() - i));

}
    
}
