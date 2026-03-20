package ej_01;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        try{
            int[] num = new int[12];
            num[0] = 39;
            num[1] = -2;
            num[6] = 14;
            num[8] = 5;
            num[9] = 120;

            System.out.println("Array: " + Arrays.toString(num));

        } catch (IndexOutOfBoundsException e){

            System.out.println("Fuera de los limites del array: " + e.getMessage());

        }

    }
}
