package ej_02;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            int[] numeros={1,2,3,4,5,6,7,8,9,10};
            int[] numeros2=new int[numeros.length];
            int j = numeros.length-1;

            for (int i = 0; i < numeros.length; i++) {
                numeros2[j] = numeros[i];
                j=j-1;
            }

            System.out.println(Arrays.toString(numeros));
            System.out.println(Arrays.toString(numeros2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("no cabe");
        }
    }
}
