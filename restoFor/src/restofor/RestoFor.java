/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restofor;

/**
 *
 * @author Karina
 */
public class RestoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int num=1000, resto; num<=1999; num ++){
            
            resto = (num%11);
            if (resto == 5 ){
                
                System.out.println(num);
                
            }
            
        }
        
    }
    
}
