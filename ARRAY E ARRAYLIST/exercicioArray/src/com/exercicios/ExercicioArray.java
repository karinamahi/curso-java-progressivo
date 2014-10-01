package com.exercicios;

public class ExercicioArray {

    public static void main(String[] args) {
        int n = 10;
        int numerosDoBilhete[] = new int[n];

        numerosDoBilhete[5] = 60;
        System.out.println(numerosDoBilhete[5]);
        System.out.println(numerosDoBilhete.length); // qtas posições tem o array

        for (int count = 0; count < numerosDoBilhete.length; count++) {
            numerosDoBilhete[count] = 2;
        }
        for (int i = 0; i < numerosDoBilhete.length; i++) {
            System.out.println(numerosDoBilhete[i]);
        }

    }

}
