package br.com.recursoshumanos.empresa;

import org.junit.Test;

public class TestandoArray {
	
	@Test
	public void testArray(){
		Funcionario [] funcionarios = new Funcionario[20];
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Ned Stark");
		funcionario.setRg("1");
		
		funcionarios[0]=funcionario;
		System.out.println(funcionarios.length);
		System.out.println(funcionarios[0]);
		
		funcionario = new Funcionario();
		funcionario.setNome("Robb Stark");
		funcionario.setRg("2");
		
		funcionarios[7] = funcionario;
		System.out.println(funcionarios.length);
		System.out.println(funcionarios[7]);
		
		System.out.println("Imprimindo funcionários: ");
		
		for (int count=0; count <=10; count ++){
            System.out.println(funcionarios[count]);
        }
		
	}
	
}
