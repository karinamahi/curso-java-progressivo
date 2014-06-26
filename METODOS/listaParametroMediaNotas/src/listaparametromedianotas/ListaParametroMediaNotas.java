
package listaparametromedianotas;

import java.util.Scanner;

public class ListaParametroMediaNotas {

    public static float media(float...notas){
        float media = 0;
        
        for(float nota: notas){
            media += nota;
        }
        return media/notas.length;
    }
    
    public static float maior(float...notas){
        float maior = 0;
        
        for(float nota: notas){
            if(nota>maior){
                maior = nota;
            }
        }
        return maior;
    }
    
    public static float menor(float...notas){
        float menor = 10;
        
        for(float nota:notas){
            if(nota<menor){
                menor = nota;
            }
        }
        return menor;
    }
    
    public static void main(String[] args) {
        float nota1, nota2, nota3;
                
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = entrada.nextFloat();
        
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = entrada.nextFloat();
        
        System.out.print("Digite a nota da terceira prova: ");
        nota3 = entrada.nextFloat();
        
        System.out.printf("A média das três provas é : %.2f\n", media(nota1, nota2, nota3));
        System.out.printf("A maior nota é = %.2f\n", maior(nota1, nota2, nota3));
        System.out.printf("A menor nota é = %.2f\n", menor(nota1, nota2, nota3));
        System.out.printf("A segunda maior nota é = %.2f\n", (nota1 + nota2 + nota3) - (maior(nota1, nota2, nota3) + menor(nota1, nota2, nota3)));
        System.out.printf("A média das duas maiores notas é = %.2f\n", (((nota1 + nota2 + nota3)- menor(nota1, nota2, nota3)))/2 ); 
    }
    
}
