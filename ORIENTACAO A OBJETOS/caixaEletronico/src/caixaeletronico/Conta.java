
package caixaeletronico;

import java.util.Random;

public class Conta {
    private String nome;
    private int numConta;
    private float saldo;
    
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
}
