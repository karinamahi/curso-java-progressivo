package br.com.supermercado;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class CaixaRegistradora {

	public static void main(String[] args){
		char dia;
		boolean promocao;
		Scanner entrada = new Scanner(System.in);
		
		
		Produto item = new Produto();
		System.out.print("Produto: ");
		item.setProduto(entrada.next());
		System.out.print("Preco: ");
		item.setPreco(entrada.nextFloat());
		RegistroDia.opcaoDia();
		System.out.print("Opção: ");
		dia = entrada.next().charAt(0);
		
		
		promocao = RegistroDia.isDiaPromocao(dia);
		if (promocao == true){
			System.out.println("\nCUPOM FISCAL");
			System.out.println("Produto: " + item.getProduto());
			System.out.printf("Preço:  R$ %.2f", item.calculaPromocao());	
		}else{
			Hora horaRegistrada = RegistroHorario.registraHora();
			
			System.out.println("\nCUPOM FISCAL");
			System.out.println("Hora registrada: " + horaRegistrada);
			
			promocao = RegistroHorario.isHoraDaPromocao();
			if(promocao == true){
				System.out.println("Produto: " + item.getProduto());
				System.out.printf("Preço:  R$ %.2f", item.calculaPromocao());	
				
			}else{
				System.out.println("Produto: " + item.getProduto());
				System.out.printf("Preço:  R$ %.2f", item.getPreco());				
			}
		}
		
		
		
		
		
		
	}
}
