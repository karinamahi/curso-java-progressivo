package br.com.recursoshumanos.empresa;

import java.util.Scanner;

public class MenuFuncionario {

	static Scanner entrada = new Scanner(System.in);
	
	public static void menu(){
		System.out.println("MENU");
		System.out.println("0. Encerrar");
		System.out.println("1. Cadastrar funcion�rio");
		System.out.println("2. Consultar dados do funcion�rio");
		System.out.println("3. Alterar sal�rio");
		System.out.println("4. Consultar ganho anual do funcion�rio");
		System.out.print("Op��o: ");
	}
	
	static Funcionario funcionario1 = new Funcionario();
	
	public static void cadastrarFuncionario(){
		System.out.println("\n");
		System.out.println("CADASTRO DE FUNCION�RIO");
		System.out.print("Nome: ");
		String nome = entrada.next();
		funcionario1.setNome(nome);
		
		System.out.print("Departamento: ");
		String departamento = entrada.next();
		funcionario1.departamento = departamento;
		
		System.out.print("Admiss�o: ");
		String dataAdmissao = entrada.next();
		funcionario1.dataAdmissao = dataAdmissao;
		
		System.out.print("RG: ");
		String rg = entrada.next();
		funcionario1.setRg(rg);
				
		System.out.print("Sal�rio: ");
		double salario = entrada.nextDouble();
		funcionario1.setSalario(salario);
	}
	
	public static void consultarFuncionario(){
		System.out.println("\n");
		System.out.println("CONSULTA");
		System.out.println("Nome: " + funcionario1.getNome());
		System.out.println("Departamento: " + funcionario1.departamento);
		System.out.println("Admiss�o: " + funcionario1.dataAdmissao);
		System.out.println("RG: " + funcionario1.getRg());
		System.out.printf("Sal�rio: %.2f",funcionario1.getSalario());
		System.out.println("\n");
		
		}
			
	public static void alterarSalario(){
		int opcao;
		double aumento;
		System.out.println("\n");
		System.out.println("REAJUSTE DE SAL�RIO");
		System.out.println("[1] Aumento de sal�rio por valor");
		System.out.println("[2] Aumento de sal�rio por percentual");
		System.out.println("Op��o: ");
		opcao = entrada.nextInt();
		
		switch (opcao){
		case 1:
			System.out.print("Valor do aumento: ");
			aumento = entrada.nextDouble();
			funcionario1.bonificaPorValor(aumento);
			System.out.printf("Sal�rio atualizado: %.2f", funcionario1.getSalario());
			System.out.println("\n");
			break;
		
		case 2:
			System.out.println("Percentual do aumento: ");
			aumento = entrada.nextDouble();
			funcionario1.bonificaPorPorcentual(aumento);
			System.out.printf("Sal�rio atualizado: %.2f", funcionario1.getSalario());
			System.out.println("\n");
			break;
			
		default:
			System.out.println("\n");
			System.out.println("Op��o incorreta");
			System.out.println("\n");
		}
	}
	

	public static void calcularGanhoAnual(){
		System.out.printf("Ganho anual: %.2f", funcionario1.calculaGanhoAnual());
		System.out.println("\n");
	}

}

