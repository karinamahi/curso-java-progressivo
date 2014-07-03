package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void menu() {
        System.out.println("MENU");
        System.out.println(" 1 - Consultar extrato");
        System.out.println(" 2 - Saque");
        System.out.println(" 3 - Depósito");
        System.out.println(" 4 - Sair");
    }

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

        do {
            menu();
            System.out.print("Digite sua opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 4) {
                continuar = false;
                System.out.println("Sessão encerrada.");

            } else {

                switch (opcao) {
                    case 1:
                        cliente1.extrato();
                        break;

                    case 2:
                        System.out.print("Digite o valor do saque: ");
                        saque = entrada.nextFloat();
                        
                        if (cliente1.saldoSuficiente(saque) == false) {
                            System.out.println("Saldo insuficiente");
                            break;
                        } else {
                            cliente1.sacar(saque);
                            qtdeDeSaques++;
                            cliente1.extrato();
                            break;
                        }
                    
                    case 3:
                        System.out.print("Digite o valor do depósito: ");
                        deposito = entrada.nextFloat();
                        cliente1.depositar(deposito);
                        cliente1.extrato();
                        break;

                    default:
                        System.out.println("Opção inválida");
                }
            }
        } while (continuar);
    }
}
