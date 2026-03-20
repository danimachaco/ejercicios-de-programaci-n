package ej_02;

import java.util.LinkedHashSet;

public class main {
    public static void main(String[] args) {

        LinkedHashSet<Integer> obj1 = new LinkedHashSet<Integer>();
        LinkedHashSet<Integer> obj2 = new LinkedHashSet<Integer>();


        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);
        obj1.add(null);

        for (Integer i : obj1) {
            if (i != null) {
                if (i % 2 != 0) {
                    obj2.add(i);
                }
            }
        }
        obj2.removeLast();
        System.out.println(obj2);
    }
}
