package ej_11;

import java.util.ArrayList;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        HashSet<Integer> lista2 = new HashSet<Integer>();
        ArrayList<Integer> lista1 = new ArrayList<Integer>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        lista1.add(5);

        for(Integer i : lista1){
            lista2.add(i);
        }

        System.out.println(lista1);
        System.out.println(lista2);

    }
}
