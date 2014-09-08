package br.com.matrizteste;

public class PassagemPorValor {

	public static  int dobra (int num){
		return num*2;
	}
	
	public static void main(String[] args) {
		int numero = 2112;
		
		System.out.println("O valor de número é : " + numero);
		System.out.println("Dobrando o seu valor.");
		dobra(numero);
		System.out.println("Agora o valor de número é : " + numero);
	}
}
