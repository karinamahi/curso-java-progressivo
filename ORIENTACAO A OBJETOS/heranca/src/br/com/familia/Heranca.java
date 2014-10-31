package br.com.familia;

import br.com.vizinho.Vizinho;

public class Heranca {
	public static void main(String[] args) {
		Neta neta = new Neta();
		System.out.println("Senha vista da classe Herança: " + neta.senhaPai);
		
		Vizinho vizinho = new Vizinho(neta);
		}
	}

