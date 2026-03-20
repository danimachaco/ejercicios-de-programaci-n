package ejemplo_estaticoadinamico;

import java.util.Arrays;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        Integer[] lista = new Integer[5];

        lista[0] = 1;
        lista[1] = 3;
        lista[2] = 2;
        lista[3] = 5;

        System.out.println(Arrays.toString(lista));

        HashSet<Integer> nuevo = new HashSet<Integer>(Arrays.asList(lista));

        //System.out.println(Arrays.toString(nuevo.toArray()));
        System.out.println(nuevo);


    }
}
