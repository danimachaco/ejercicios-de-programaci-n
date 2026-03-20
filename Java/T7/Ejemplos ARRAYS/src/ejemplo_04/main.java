package ejemplo_04;

import java.util.Arrays;

public class main {
    public static int[] metodo(int[] arrayNumeros){
        int[] array = new int[4];
        array[0] = arrayNumeros[0]+1;
        array[1] = arrayNumeros[1]+1;
        array[2] = arrayNumeros[2]+1;
        array[3] = arrayNumeros[3]+1;

        return array;
    }


    public static void main(String[] args) {
        int [] numeros = {1,2,3,4};

        int[] resultado = metodo(numeros);

        System.out.println(resultado[3]);
    }
}
