/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntest;

/**
 *
 * @author Karina
 */
public class ReturnTest {

    public static int soma() {
        return 1 + 1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Declarando a variável 'res_soma' e recebendo o método soma(): ");
        int res_soma = soma();
        System.out.println(res_soma);

        System.out.println("Imprimindo diretamente o resultado do return: " + soma());
        System.out.println("Usando em uma soma: 2 + soma() = " + (2 + soma()));
        System.out.println("Usando em um produto: 3 * soma() = " + (3 * soma()));
    }

}
