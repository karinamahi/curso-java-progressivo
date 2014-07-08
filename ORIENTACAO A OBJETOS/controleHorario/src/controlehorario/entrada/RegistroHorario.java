
package controlehorario.entrada;

import controlehorario.Hora;
import java.util.Scanner;

public class RegistroHorario {
    
       public static Hora registrarEntrada(){
        Scanner entrada = new Scanner(System.in);
        int entradaHour;
        int entradaMinute;
        int entradaSecond;       

        System.out.println("ENTRADA");
        System.out.print("Hora: ");
        entradaHour = entrada.nextInt();
        System.out.print("Minutos: ");
        entradaMinute = entrada.nextInt();
        System.out.print("Segundos: ");
        entradaSecond = entrada.nextInt();
        
        Hora horaChegada = new Hora(entradaHour, entradaMinute,entradaSecond);
           return horaChegada;
       }
    
        public static Hora registrarSaida() {
        int saidaHour;
        int saidaMinute;
        int saidaSecond;

        Scanner saida = new Scanner(System.in);

        System.out.println("\nSAÍDA");
        System.out.print("Hora: ");
        saidaHour = saida.nextInt();
        System.out.print("Minutos: ");
        saidaMinute = saida.nextInt();
        System.out.print("Segundos: ");
        saidaSecond = saida.nextInt();

        Hora horaSaida = new Hora(saidaHour, saidaMinute, saidaSecond);
        return horaSaida;
    }
}
