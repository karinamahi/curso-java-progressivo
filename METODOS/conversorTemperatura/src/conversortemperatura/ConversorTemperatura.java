/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperatura;

/**
 *
 * @author Karina
 */
import java.util.Scanner;

public class ConversorTemperatura {

    public static float paraCelsius(float num) {
        return 5 * (num - 32) / 9;
    }

    public static float paraFarenheit(float num) {
        return (9 * num / 5) + 32;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float temperatura;
        char opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        temperatura = entrada.nextFloat();

        System.out.print("Para converter para Celsius digite 'C'. Para converter para Farenheit digite 'F': ");
        String comando = entrada.next();
        if (comando == null || "".equalsIgnoreCase(comando)) {
            System.out.println("O comando não pode ser nulo");
            return;
        }
        opcao = comando.charAt(0);

        switch (opcao) {
            case 'C':
            case 'c':
                System.out.printf("%.2f°F = %.2f°C\n", temperatura, paraCelsius(temperatura));
                break;
            case 'F':
            case 'f':
                System.out.printf("%.2f°C = %.2f°F\n", temperatura, paraFarenheit(temperatura));
                break;
            default:
                System.out.println("Opção incorreta.");
        }
    }

}
