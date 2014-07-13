package br.com.supermercado;

public class CupomFiscal {
	

	public static void imprimirCupomFiscal(String produto, float preco){
		System.out.println("\nCUPOM FISCAL");
		System.out.println("Produto: " + produto);
		System.out.printf("Preço:  R$ %.2f\n", preco);
	}
	
}

