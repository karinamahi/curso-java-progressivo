package br.com.comocompararobjetos;

public class Funcionario implements Comparable {
	private String nome;
	private String cargo;
	private float salario = 0;
	
	public Funcionario(String nome, String cargo, float salario){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public int compareTo(Object o){
		Funcionario func = (Funcionario) o;
		
		if(getSalario() > func.getSalario()){
			return 1;
		}
		else{
			if(getSalario() < func.getSalario()){
				return -1;
			}
			else{
				return 0;
			}
		}
	}

	public String getNome(){
		return this.nome;
	}
	
	public String getCargo(){
		return this.cargo;
	}
	
	public float getSalario(){
		return this.salario;
	}

	
	
}
