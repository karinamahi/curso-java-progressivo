package br.com.supermercado;

import java.util.Scanner;

public class Produto {
	
	private String produto;
	private float preco;
	
	Scanner entrada = new Scanner(System.in);
	
	public Produto(){
		
	}
	
	public Produto(String produto, float preco){
		this.produto = produto;
		this.preco = preco;
	}
	
	
	public void setProduto(String produto){
		this.produto = produto;
	}
	
	public void setPreco(float preco){
		this.preco = preco;
	}
	
	public String getProduto(){
		return this.produto;
	}
	
	public float getPreco(){
		return this.preco;
	}
	
	public float calculaPromocao(){
		float precoComDesconto = (float) (this.preco*0.9);
		return precoComDesconto;
	}
	
	
	


}
