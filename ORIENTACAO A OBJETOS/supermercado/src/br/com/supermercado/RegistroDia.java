package br.com.supermercado;

public class RegistroDia {
	
	public static void opcaoDia(){
		System.out.println("Dia da Semana: ");
		System.out.println("[A] Segunda-Feira");
		System.out.println("[B] Terça-Feira");
		System.out.println("[C] Quarta-Feira");
		System.out.println("[D] Quinta-Feira");
		System.out.println("[E] Sexta-Feira");
		System.out.println("[F] Sábado-Feira");
		System.out.println("[G] Domingo-Feira");
	}

	public static boolean isDiaPromocao(char dia){
		boolean diaPromocao = false;
				
		switch(dia){
		case 'f': case 'F':
			diaPromocao = true;
			break;
		case 'g': case 'G':
			diaPromocao = true;
			break;
		}
		return diaPromocao;
	}

}
