package ejemplo_dinamicoaestatico;

import java.util.Arrays;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> lista = new HashSet <Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(3);

        System.out.println(lista);

        Integer[] arrayEstatico = new Integer[lista.size()];
        lista.toArray(arrayEstatico);

        System.out.println(Arrays.toString(arrayEstatico));
    }
}
