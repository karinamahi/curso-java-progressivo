
package caixaeletronico;

import java.util.Random;
import java.util.Scanner;

public class Conta {
    private String nome;
    private int numConta;
    private float saldo;
                   int opcao;
        float saque;
        float deposito;
        int qtdeDeSaques = 0;
        boolean continuar = true;
        Scanner entrada = new Scanner(System.in);
        
    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
       public void menu() {
        System.out.println("\nMENU");
        System.out.println(" 1 - Consultar extrato");
        System.out.println(" 2 - Saque");
        System.out.println(" 3 - Depósito");
        System.out.println(" 4 - Sair\n");
    }
    
     public int geraNumConta(){
        Random geradorDeConta = new Random();
        final int high = 9999;
        final int low = 1000; 
        return geradorDeConta.nextInt(high+1)+low;
    }
    
    public void extrato(){
        System.out.println("===========================");
        System.out.println("________EXTRATO____________");
        System.out.println("Cliente :" + this.getNome());
        System.out.println("Conta: " + this.getNumConta());
        System.out.printf("Saldo: %.2f\n", this.getSaldo());
        System.out.println("===========================");
    }
    
    public void sacar(float valorDoSaque){
        this.saldo -= valorDoSaque;
    }
    
    public boolean saldoSuficiente(float valorDoSaque ){
        boolean saldoSuficiente = true;
        float previsaoDeSaldo;
        previsaoDeSaldo = this.saldo - valorDoSaque;
        if (previsaoDeSaldo<0){
            saldoSuficiente = false;
        }
        return saldoSuficiente;
        }
    
    public void depositar (float valorDoDeposito){
        this.saldo += valorDoDeposito;
    }
    
    public void operacao(){
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
                        extrato();
                        break;

                    case 2:
                        if (qtdeDeSaques >= 3) {
                            System.out.println("Limite de saques atingido");
                            break;
                            
                        } else {
                            System.out.print("Digite o valor do saque: ");
                            saque = entrada.nextFloat();

                            if (saldoSuficiente(saque) == false) {
                                System.out.println("Saldo insuficiente");
                                break;
                                
                            } else {
                                sacar(saque);
                                qtdeDeSaques += 1;
                                extrato();
                                break;
                            }
                        }

                    case 3:
                        System.out.print("Digite o valor do depósito: ");
                        deposito = entrada.nextFloat();
                        depositar(deposito);
                        extrato();
                        break;

                    default:
                        System.out.println("Opção inválida");
                }
            }
        } while (continuar);
    }
}
