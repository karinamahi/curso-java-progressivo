package impares;

public class Impares {

    public static void main(String[] args) {
        int inicial=1,
            valor_max=99,
            razao=2,
            n=inicial;
        
        System.out.printf("Números ímpares de %d a %d\n", inicial, valor_max);
        while(n<=valor_max){
            System.out.println(n);
            n+=razao;
        }
    }
}
