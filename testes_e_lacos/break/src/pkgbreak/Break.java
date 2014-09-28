
package pkgbreak;

public class Break {

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
