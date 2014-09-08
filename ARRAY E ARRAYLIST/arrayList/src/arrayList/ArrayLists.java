package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> bandas = new ArrayList<String>();
		
		bandas.add("Rush");
		System.out.print("Adicionando a banda Rush: ");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		bandas.add("Beatles");
		System.out.print("Adicionando a banda Beatles: ");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		bandas.add("Iron Maiden");
		System.out.print("Adicionando a banda Iron Maiden: ");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		System.out.print("Quem está no índice 0: ");
		System.out.println(bandas.get(0));
		
		System.out.print("Adicionando Tiririca onde estava o  Rush: ");
		bandas.add( bandas.indexOf("Rush"), "Tiririca");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		System.out.print("Números de elementos na lista: ");
		System.out.println(bandas.size());
		
		System.out.print("Removendo o Tiririca");
		bandas.remove("Tiririca");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		System.out.print("Removendo tudo");
		bandas.clear();
		System.out.println(Arrays.toString(bandas.toArray()));
	
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		pessoa1.setNome("Karina Mayumi Hirata Bueno");
		pessoa1.setRg("123321");
		pessoa2.setNome("Karina Mayumi Hirata Bueno");
		pessoa2.setRg("123321");
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		System.out.println(pessoas.size());
		
		for(int posicao = 0; posicao < pessoas.size(); posicao ++){
			System.out.println(pessoas.get(posicao));
		}
		
		pessoas.remove(pessoa2); // se as instancias Nome e Rg forem iguais o método remove irá remover o primeiro que ele identificar como igual e não necessariamente o objeto 'pessoa2'
		System.out.println(pessoas.size());
		System.out.println(pessoa1.equals(pessoa2));
	}
	
}
