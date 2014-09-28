package sala;

import java.util.Scanner;

public class Sala {

    public static void main(String[] args) {
        int alunos_total,
            razao=1,    
            aluno=razao,
            nota,    
            nota_total=0,
            media;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos alunos existem nesta turma: \n");
        alunos_total= entrada.nextInt();
        
        while(aluno<=alunos_total){
            System.out.printf("Digite a nota do aluno número %d\n",aluno);
            nota= entrada.nextInt();
            nota_total +=nota;
            aluno +=razao;
        } 
        media =(nota_total/alunos_total);
        System.out.printf("A média das notas dos alunos desta turma é %d\n", media);
    }
}
