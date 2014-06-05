/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgbreak;

/**
 *
 * @author Karina
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // calcula o tempo de execução com o comando break
        long i = System.currentTimeMillis();
        
        for (int count = 1 ; count <= 1000000; count ++){
            if ((count%17==0) && (count%19==0)){
                System.out.println(count);
                break;
            }
        }
        System.out.println("Tempo de execução, em mili-segundos: " + (System.currentTimeMillis() - i ));
        
    }
    
}
