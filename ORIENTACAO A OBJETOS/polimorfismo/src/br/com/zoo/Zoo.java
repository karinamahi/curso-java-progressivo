package br.com.zoo;

public class Zoo {

	public static void main(String[] args) {
		Vaca mimosa = new Vaca();
		Gato bichano = new Gato();
		Carneiro barnabe = new Carneiro();
		
		Animal[] bichos = {mimosa, bichano, barnabe};
		
		for(Animal animal : bichos){
			System.out.print(animal.nome + " é o nome da classe " + animal.getClass().getName() + ", tem " + animal.numeroPatas + " patas e faz ");
			animal.som();
			System.out.println();
		}
	}
}
