package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        String nome;
        float saldo;
        int numConta;
        int opcao;
        float saque;
        float deposito;
        int qtdeDeSaques = 0;
        boolean continuar = true;

        Conta cliente1 = new Conta();

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        cliente1.setNome(entrada.next());

        System.out.print("Digite o valor do depósito incial: ");
        cliente1.setSaldo(entrada.nextFloat());

        System.out.println("Sr(a). " + cliente1.getNome());

        cliente1.setNumConta(cliente1.geraNumConta());
        System.out.printf("O número da sua conta é %d\n\n", cliente1.getNumConta());

        cliente1.operacao();

    }
}
