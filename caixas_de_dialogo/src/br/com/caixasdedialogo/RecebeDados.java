package br.com.caixasdedialogo;

import javax.swing.JOptionPane;

public class RecebeDados {
	
	public static void main(String[] args) {
		String nome;
		
		nome = JOptionPane.showInputDialog("Digite seu nome, caro usuário.");
		nome = String.format(nome + "???\nNossa, que nome feio! Pelo menos sabe programar em Java!");
		JOptionPane.showMessageDialog(null, nome);
	}
}
