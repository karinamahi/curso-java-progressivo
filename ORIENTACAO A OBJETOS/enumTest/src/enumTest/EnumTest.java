package enumTest;

import java.util.Scanner;

public class EnumTest {

	public enum Bebida {

		CocaCola("Cola-cola", 2.00), Suco("Suco", 1.50), Agua("Agua", 1.00);

		private double preco;
		private String nome;

		Bebida(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;
		}

		public double getPreco() {
			return this.preco;
		}

		public String getNome() {
			return this.nome;
		}
	}

	public enum Comida {
		Sanduiche("Sanduiche", 4.00), Hotdog("Hotdog", 3.0), Xburguer(
				"X-Burguer", 3.5);

		private double preco;
		private String nome;

		Comida(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;
		}

		public double getPreco() {
			return this.preco;
		}

		public String getNome() {
			return this.nome;
		}
	}

	public static void menu() {
		System.out.println("\tBebidas");
		System.out.println("1. " + Bebida.CocaCola.getNome() + ": R$"
				+ Bebida.CocaCola.getPreco());
		System.out.println("2. " + Bebida.Suco.getNome() + ": R$"
				+ Bebida.Suco.getPreco());
		System.out.println("3. " + Bebida.Agua.getNome() + ": R$"
				+ Bebida.Agua.getPreco());

		System.out.println("\tComidas");
		System.out.println("4. " + Comida.Sanduiche.getNome() + ": R$"
				+ Comida.Sanduiche.getPreco());
		System.out.println("5. " + Comida.Hotdog.getNome() + ": R$"
				+ Comida.Hotdog.getPreco());
		System.out.println("6. " + Comida.Xburguer.getNome() + ": R$"
				+ Comida.Xburguer.getPreco());

		System.out.println("0. Sair");
		System.out.print("Digite sua opção: ");
	}

	public static double preco(int opcao) {
		switch (opcao) {
		case 1:
			return Bebida.CocaCola.getPreco();
		case 2:
			return Bebida.Suco.getPreco();
		case 3:
			return Bebida.Agua.getPreco();
		case 4:
			return Comida.Sanduiche.getPreco();
		case 5:
			return Comida.Hotdog.getPreco();
		case 6:
			return Comida.Xburguer.getPreco();
		default:
			return 0.0;
		}

	}

	public static void main(String[] args) {
		double total = 0.0;
		int opcao = 0;
		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();
			total += preco(opcao);

			System.out.println("Opção escolhida: " + opcao);
			System.out.println("Valor da conta: " + total + "\n");
		} while (opcao != 0);
	}
}
