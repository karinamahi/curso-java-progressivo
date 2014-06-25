
package primeiraclasse;

import java.util.Scanner;

public class PrimeiraClasse {
    
 

    public static void main(String[] args) {
        
        Aluno donaFifi = new Aluno();
        String nome;
        double notaMat,
               notaFis;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        nome = entrada.nextLine();
        
        System.out.print("Nota de matemática: ");
        notaMat = entrada.nextDouble();
        
        System.out.print("Nota de física: ");
        notaFis = entrada.nextDouble();
        
        Aluno patropi = new Aluno(nome, notaMat, notaFis);
                       
        //Dentro do printf usamos \" para exibir aspas duplas
        System.out.printf("O aluno \"%s\" tirou %2.2f em matemática, %2.2f em física e obteve média %2.2f.\n", patropi.nome, patropi.notaMat, patropi.notaFis, (patropi.notaFis + patropi.notaMat)/2 );
    }
    
}
