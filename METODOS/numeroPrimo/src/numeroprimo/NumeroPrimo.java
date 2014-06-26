package numeroprimo;

public class NumeroPrimo {

    public static boolean par(int num) {
        boolean par = false;
        if (num % 2 == 0) {
            par = true;
        }
        return par;
    }

    public static boolean isPrimo(int num) {
        if (num == 2) {
            return true;
        }
        if (par(num)) {
            return false;
        }

        int restoZero = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                restoZero++; // conta quantas vezes o resultado da divisão de num/i foi igual a zero.
            }
        }
        if (restoZero == 2) { // para ser primo,o resultado de num/i pode obter resto zero apenas duas vezes: quando dividido por 1 ou por ele mesmo. 
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}
