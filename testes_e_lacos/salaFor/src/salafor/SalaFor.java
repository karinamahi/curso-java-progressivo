package salafor;

import java.util.Scanner;

public class SalaFor {

    public static void main(String[] args) {
        int n;
        int nota_total = 0;
        float media;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de alunos da sala: ");
        System.out.println("");
        n = entrada.nextInt();

        for (int aluno = 1, nota_aluno; (aluno <= n); aluno++) {
            System.out.printf("Digite a nota do aluno %d : ", aluno);
            nota_aluno = entrada.nextInt();
            nota_total += nota_aluno;
        }
        media = (nota_total / n);
        System.out.println("A média da turma é " + media);
    }

}
