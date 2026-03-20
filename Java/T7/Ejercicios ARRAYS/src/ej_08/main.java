package ej_08;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 0 ; i < numeros.length ; i ++) {
            int numero = sc.nextInt();
            numeros[i] = numero;
        }
    }
}
