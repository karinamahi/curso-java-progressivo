package br.com.caixasdedialogo;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class CaixaDeTexto {
	
	public static void main(String[] args) {
		String mensagem;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a mensagem a ser exibida na caixa de diálogo: ");	
		mensagem = entrada.nextLine();
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
