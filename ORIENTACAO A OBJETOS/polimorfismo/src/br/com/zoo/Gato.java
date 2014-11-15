package br.com.zoo;

public class Gato extends Animal{
	public Gato(){
		this.nome = "Bichano";
		this.numeroPatas = 4;
	}
	
	@Override
	public void som(){
		System.out.println("Miau");
	}

}
