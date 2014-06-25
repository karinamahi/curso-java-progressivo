/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoteste;

/**
 *
 * @author Karina
 */
public class MetodoTeste {

    /**
     * @param args the command line arguments
     */
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
