package controlehorario;

public class Funcionario {

    private String nome;
    private boolean atraso;
    private double tempoTrabalhado;
    private double tempoAtraso;

    public Funcionario(String nome, Hora horaChegada, Hora horaSaida) {
        this.nome = nome;
        this.tempoAtraso = tempoAtraso(horaChegada);

        if (this.tempoAtraso > 0) {
            this.atraso = true;
        }

        if (atraso) {
            System.out.println("Funcionario " + this.nome + " atrasado.");
        }

        this.tempoTrabalhado = horasTrabalhadas(horaChegada, horaSaida);
    }

    public double tempoAtraso(Hora horaChegada) {
        return ((horaChegada.getHour() * 60 * 60 + horaChegada.getMinute() * 60 + horaChegada.getSecond()) - 8 * 3600) / 3600.0;
    }

    public double horasTrabalhadas(Hora horaChegada, Hora horaSaida) {
        double horas = ((horaSaida.getHour() * 60 + horaSaida.getMinute()) - (horaChegada.getHour() * 60 + horaChegada.getMinute())) / 60.0;

        if (horas < 0) {
            throw new IllegalArgumentException("Hora de saída anterior a hora de chegada");
        }
        return horas;
    }


    public double getHorasTrabalhadas(){
        return this.tempoTrabalhado;
    }
}
