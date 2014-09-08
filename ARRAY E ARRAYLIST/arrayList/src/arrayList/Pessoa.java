package arrayList;

import java.util.Arrays;

public class Pessoa {

	String nome = "";
	String rg = "";
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getRg(){
		return this.rg;
	}	
	
	@Override
	public String toString(){
		return this.nome + " " + this.rg;
	}
	
	public boolean equals(Object obj){
		Pessoa other = (Pessoa)obj;   // cast
		
		boolean equals = false;
		if(this.rg.equals(other.rg)){
			equals = true;
		}
		return equals;
	}
}
