package ej_03;

import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        TreeSet<Integer> obj1 = new TreeSet<Integer>();

        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);
        obj1.add(7);
        obj1.add(8);
        obj1.add(9);
        obj1.add(10);

        Integer suma = 0;

        for (Integer integer : obj1) {

            suma += integer;

        }

        System.out.println(suma);

    }
}
