package ej_09;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(null);

        for(Integer i : lista){
            if(i != null){
                if(i % 2 != 0){
                    lista2.add(i);
                }
            }
        }

        System.out.println(lista);
        System.out.println(lista2);

    }
}
