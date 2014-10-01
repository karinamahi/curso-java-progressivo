package arraysClass;

import java.util.Arrays;

public class ArraysClass {
	
	public static void main(String[] args) {
		int[] numeros = {1, 4, 0, -13, 2112, 14, 17};
		int posicao;
		
		System.out.println("Os elemntos do array são " + Arrays.toString(numeros));
		System.out.println("Ordenando...");
		
		Arrays.sort(numeros);
		
		System.out.println("Array ordenado: " + Arrays.toString(numeros));
		
		posicao = Arrays.binarySearch(numeros, 2112);
		System.out.println("Posicao do elemento '2112': " + posicao);
	}

}
