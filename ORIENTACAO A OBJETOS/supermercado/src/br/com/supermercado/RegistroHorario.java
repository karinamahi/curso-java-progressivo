package br.com.supermercado;

import java.util.Scanner;

public class RegistroHorario {
	static int hour;
	static int minute;
	static int second;

	public static Hora registraHora() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("HORA DA COMPRA");
		System.out.print("Hora: ");
		hour = entrada.nextInt();
		System.out.print("Minutos: ");
		minute = entrada.nextInt();
		System.out.print("Segundos: ");
		second = entrada.nextInt();

		Hora horaDaCompra = new Hora(hour, minute, second);
		// System.out.println("Hora da Compra: " + horaDaCompra);
		return horaDaCompra;
	}

	public static boolean isHoraDaPromocao() {
		boolean horaPromocao = false;

		if (hour >= 20 && hour <= 24) {
			horaPromocao = true;
		}
		return horaPromocao;
	}

}
