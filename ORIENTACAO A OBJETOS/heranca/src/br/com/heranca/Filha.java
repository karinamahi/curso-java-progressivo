package br.com.heranca;

public class Filha extends Pai {

	private String nomeFilha;
	
	public Filha(String nomeFilha){
		this.nomeFilha = nomeFilha;
		
		System.out.println("O nome da filha � " + this.nomeFilha + " e o nome do pai � " + nomePai + ".");
	}
}
