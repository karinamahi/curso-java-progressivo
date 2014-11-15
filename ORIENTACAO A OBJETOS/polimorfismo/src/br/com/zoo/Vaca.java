package br.com.zoo;

public class Vaca extends Animal {
	public Vaca(){
		this.nome = "Mimosa";
		this.numeroPatas = 4;
	}
	
	@Override
	public void som(){
		System.out.println("Muuuu");
	}
}
