
package numerosperfeitos;

public class NumerosPerfeitos {

    public static boolean isRestoZero(int num, int divisor){
        boolean restoZero= false;
        if(num%divisor==0){
            restoZero = true;
        }
        return restoZero;
    }
    
    public static boolean isPerfeito(int num){
        boolean perfeito = false;
        int fatores = 0;
        for (int divisor = 1; divisor < num; divisor++) {
            if(isRestoZero(num, divisor)== true){
                fatores += divisor;
            }
        }
        
        if(fatores==num){
            perfeito = true;
        }
        return perfeito;
    } 
    
    public static void main(String[] args) {
        
        for (int numero = 0; numero < 10000; numero++) {
            if(isPerfeito(numero) == true){
                System.out.println(numero);
            }
        }
    }
    
}
