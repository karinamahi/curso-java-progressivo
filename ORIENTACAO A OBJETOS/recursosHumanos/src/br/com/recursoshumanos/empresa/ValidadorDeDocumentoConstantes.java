package br.com.recursoshumanos.empresa;

import java.util.Scanner;

public class ValidadorDeDocumentoConstantes {

	public static final int RG=1;
	public static final int CPF=2;
	
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("[1] RG");
		System.out.println("[2] CPF");
		System.out.println("Digite o tipo de documento: ");
		int opcao = entrada.nextInt();
		
		switch(opcao){
		case RG:
			System.out.println("Digite o RG");
			break;
		case CPF:
			System.out.println("Digite o CPF");
			break;
		}
		
	}
}
