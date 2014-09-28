
package restofor;

public class RestoFor {

    public static void main(String[] args) {
        
        for(int num=1000, resto; num<=1999; num ++){
            
            resto = (num%11);
            if (resto == 5 ){
                System.out.println(num);
            }
        }
    }
}
