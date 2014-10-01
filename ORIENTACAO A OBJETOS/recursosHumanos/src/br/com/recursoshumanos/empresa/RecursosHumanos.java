package br.com.recursoshumanos.empresa;

import java.util.Scanner;

public class RecursosHumanos {
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		
		do{
			MenuFuncionario.menu();
			opcao = entrada.nextInt();
			
			if(opcao==0){
				System.out.println("Fim");
				
			}
			else{
				
				switch(opcao){
				case 1:
					MenuFuncionario.cadastrarFuncionario();
					break;
				case 2:
					MenuFuncionario.consultarFuncionario();
					break;
				case 3:
					MenuFuncionario.alterarSalario();
					break;					
				case 4:
					MenuFuncionario.calcularGanhoAnual();
					break;
				}	
			}				
		}
		while(opcao!=0);
	
		//questão 4
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Ned Stark");
		funcionario2.setSalario(200.00);
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Ned Stark");
		funcionario3.setSalario(200.00);
		
		if(funcionario2==funcionario3){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
		
		
		//questão 5
		
		Funcionario funcionario4 = new Funcionario();
		funcionario4.setNome("Jofrey");
		funcionario4.setSalario(300);
		
		Funcionario funcionario5 = funcionario4;
		
		if(funcionario4 == funcionario5){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
	}
}
