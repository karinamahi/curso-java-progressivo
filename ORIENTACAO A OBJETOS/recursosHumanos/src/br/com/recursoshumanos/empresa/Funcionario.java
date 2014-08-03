package br.com.recursoshumanos.empresa;

import java.util.Scanner;

public class Funcionario {
	private String nome = "";
	private double salario;
	private String rg ="";
	String dataAdmissao = "";
	String departamento = "";
	Scanner entrada = new Scanner(System.in);
	
	public String getNome(){
		return this.nome;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public String getRg(){
		return this.rg;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public void bonificaPorValor(double aumento){
		this.salario += aumento;
	}
	
	public void bonificaPorPorcentual(double aumento){
		this.salario *= 1 + (aumento/100);
	}
	
	public double calculaGanhoAnual(){
		double ganhoAnual;
		ganhoAnual = this.salario*12;
		return ganhoAnual;
	}

	public String toString(){
		return "Nome: " + this.nome + " RG: " + this.rg;
	}
	
	public boolean equals(Object object){
		Funcionario func = (Funcionario) object;
		return this.rg.equals(func.getRg());
	}
}
