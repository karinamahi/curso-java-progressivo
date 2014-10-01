package br.com.recursoshumanos.empresa;

import java.util.Scanner;

public class ValidadorDeDocumentoEnum {

	public static void main(String[] args) {
		TipoDocumento tipo = TipoDocumento.CPF;
		System.out.println(tipo);
		
		tipo = TipoDocumento.valueOf("RG");
		System.out.println(tipo);
		
	Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("[1] RG");
		System.out.println("[2] CPF");
		System.out.println("Digite o tipo de documento: ");
		String opcao = entrada.next();
		tipo = TipoDocumento.valueOf(opcao);
		String documento = null;
		
		switch(tipo){
		case RG:
			System.out.println("Digite o RG");
			documento = entrada.next();
			tipo.validar(documento);
			break;
		case CPF:
			System.out.println("Digite o CPF");
			documento = entrada.next();
			tipo.validar(documento);
			break;
		}
	
		
	}
}
