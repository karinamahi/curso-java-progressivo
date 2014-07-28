package br.com.recursoshumanos.empresa;

import java.util.Scanner;

public class RecursosHumanos {
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner entrada = new Scanner(System.in);
				
		
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
		
	}
}
