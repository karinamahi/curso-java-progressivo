
package comparando;

import java.util.Scanner;

public class Comparando {

    public static void main(String[] args) {
        float num1, num2;
        int num3, num4;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextFloat();
        
        System.out.print( num1 + ">" + num2 +  " = " + (num1>num2)+("\n"));
        System.out.print(num1 + " >= " + num2 + " = " + (num1>=num2)+ "\n");
        System.out.print(num1 + " < " + num2 + " = " + (num1<num2)+ "\n");
        System.out.print(num1 + " <= " + num2 + " = " + (num1<=num2) + "\n");
        System.out.print(num1 + " == " + num2 + " = " + (num1==num2) + "\n");
        System.out.print(num1 + " != " + num2 + " = " + (num1!=num2)+ "\n");
        
        
        System.out.print("Digite o primeiro número: ");
        num3 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num4 = entrada.nextInt();
        
        System.out.printf("%d + %d = %d\n", num3, num4, num3 + num4);
        System.out.printf("%d > %d -> %s\n", num3, num4, num3 > num4); 
    }
    
}
