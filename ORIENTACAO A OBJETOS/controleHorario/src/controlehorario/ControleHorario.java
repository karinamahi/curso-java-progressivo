
package controlehorario;

import controlehorario.entrada.RegistroHorario;

public class ControleHorario {

    public static void main(String[] args) {
        
        Hora horaChegada = RegistroHorario.registrarEntrada();
        Hora horaSaida = RegistroHorario.registrarSaida();
        Funcionario geddyLee = new Funcionario("Geddy Lee", horaChegada, horaSaida);
        
        System.out.println("\nHora de chegada: " + horaChegada);
        System.out.println("Hora de saída: " + horaSaida);
        System.out.printf("Horas trabalhadas: %.1f\n", geddyLee.getHorasTrabalhadas());
    }
    
}
