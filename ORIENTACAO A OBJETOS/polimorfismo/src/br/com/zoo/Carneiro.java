package br.com.zoo;

public class Carneiro extends Animal{
	public Carneiro(){
		this.nome = "Barbabé";
		this.numeroPatas = 4;
	}
	
	@Override
	public void som(){
		System.out.println("Bééé");
	}
}
