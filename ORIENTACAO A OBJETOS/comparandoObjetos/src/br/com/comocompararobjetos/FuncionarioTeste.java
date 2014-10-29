package br.com.comocompararobjetos;

import java.util.Arrays;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		float salarioTotal = 0;
		
		Funcionario[] funcionarios = {new Funcionario("Mr. White", "Gerente", 10000),
									  new Funcionario("Skyler", "Caixa", 1000),
									  new Funcionario("Hank", "Seguran�a", 3000),
									  new Funcionario("Gustavo Fring","Vendedor", 3000),
									  new Funcionario("Jesse Pinkman", "Produ��o", 800)};
		
		Arrays.sort(funcionarios);
		for(Funcionario func : funcionarios)
				System.out.printf(func.getNome() + "\n" + func.getCargo() + "\n%.2f\n\n" , func.getSalario());
		
		for(Funcionario func : funcionarios)
				salarioTotal = salarioTotal + func.getSalario();
				System.out.printf("\nTotal de gastos com funcion�rio por m�s: R$ %.2f", salarioTotal);
	}

}
