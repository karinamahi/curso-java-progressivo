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
			CupomFiscal.imprimirCupomFiscal(item.getProduto(),item.calculaPromocao());
			
		}else{
			Hora horaRegistrada = RegistroHorario.registraHora();
			promocao = RegistroHorario.isHoraDaPromocao();
			
			if(promocao == true){
				CupomFiscal.imprimirCupomFiscal(item.getProduto(),item.calculaPromocao());
				System.out.println("Hora registrada: " + horaRegistrada);
				
			}else{
				CupomFiscal.imprimirCupomFiscal(item.getProduto(),item.getPreco());
			}
		}
		
		
		
		
		
		
	}
}
