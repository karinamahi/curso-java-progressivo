/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package continuetest;

/**
 *
 * @author Karina
 */
public class ContinueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        
        for (int count=1; count <= 1000000; count ++){
            if(count%2==0){
                continue;
            }
            if((count%17==0) && (count%19==0)){
                System.out.println(count);
                break;  
            }
        }
        System.out.println("Tempo de execução, em milissegundos: " + (System.currentTimeMillis() - i ));
    }
    
}
 