package ej_07;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int max=11;
        int min=0;
        for (int i = 0 ; i < numeros.length ; i ++) {
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        for (int j = 0 ; j < numeros.length ; j ++) {
            if (max < numeros[j]) {
                max = numeros[j];

            } else if (min > numeros[j]) {
                min = numeros[j];

            }
        }
        for (int k = 0 ; k < numeros.length ; k ++) {
            System.out.println(numeros[k] + " ");
            if (max == numeros[k]) {
                System.out.println("maximo");
            }
            if (min == numeros[k]) {
                System.out.println("minimo");
            }
        }
    }
}
