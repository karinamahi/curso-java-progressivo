package br.com.recursoshumanos.empresa;

import org.junit.Assert;
import org.junit.Test;

public class TestandoEquals {

	@Test
	public void deveRetornarFalseQuandoCompararInstanciasDiferentes(){
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Ned Stark");
		funcionario2.setSalario(200.00);
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Ned Stark");
		funcionario3.setSalario(200.00);
		
		boolean isEquals = funcionario2 == funcionario3;
		Assert.assertFalse(isEquals);
		
	}
	
	@Test
	public void deveRetornarTrueQuandoCompararComEquals(){
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Ned Stark");
		funcionario2.setSalario(200.00);
		funcionario2.setRg("1");
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Ned Stark");
		funcionario3.setSalario(200.00);
		funcionario3.setRg("1");
		
		System.out.println(funcionario2);
		System.out.println(funcionario3.toString());
		
		boolean isEquals = funcionario2.equals(funcionario3);
		Assert.assertTrue(isEquals);
		
	}
}
