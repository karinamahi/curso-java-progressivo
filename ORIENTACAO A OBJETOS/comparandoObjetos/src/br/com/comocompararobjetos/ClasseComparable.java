package br.com.comocompararobjetos;

import java.util.Arrays;

public class ClasseComparable {

	public static void main(String[] args) {
		
		Carro[] carros = {new Carro(1974, "Fusca"),
						new Carro(2014, "Hilux"),
						new Carro(2000, "Uno"),
						new Carro(1998, "Gol")};
		
		Arrays.sort(carros);
		
		for (Carro car : carros){
			System.out.println(car.getNome() + "\t" + car.getAno());
		}
	}
}
