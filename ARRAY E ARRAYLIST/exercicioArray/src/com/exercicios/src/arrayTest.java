import java.util.Scanner;


public class arrayTest {

	public static void main(String[] args) {
		int [] nota = new int[3];
		Scanner entrada = new Scanner(System.in);
		
		for(int indice = 0; indice < 3; indice ++){
			System.out.println("\nEntre com um número " + (indice + 1) + " : ");
			nota[indice] = entrada.nextInt();
		}
		
		for(int indice = 0; indice < 3; indice ++){
			System.out.printf("Número %d -> valor armazenado: %d\n", indice + 1, nota[indice]);
		}
	}
}
