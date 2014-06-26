package metodoteste;

public class MetodoTeste {

    public static void mensagem() {
        System.out.println("Curso Java Progressivo!");
    }

    public static void main(String[] args) {
        System.out.println("Exibindo a mensagem uma vez: ");
        mensagem();

        System.out.println("Exibindo a mensagem três vezes: ");
        for (int count = 1; count <= 3; count++) {
            mensagem();
        }
    }

}
