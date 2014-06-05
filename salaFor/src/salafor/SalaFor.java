/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salafor;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class SalaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,
               nota_total=0;
        float media;
                
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de alunos da sala: ");
        System.out.println("");
        n = entrada.nextInt();
        
        for(int aluno=1, nota_aluno; (aluno<=n); aluno++){
            System.out.printf("Digite a nota do aluno %d : ", aluno);
            nota_aluno = entrada.nextInt();
            nota_total += nota_aluno;            
        }
        //System.out.println(nota_total);
        media = (nota_total/n);
        //System.out.println(media);
        System.out.println("A média da turma é " + media);
    }
    
}
