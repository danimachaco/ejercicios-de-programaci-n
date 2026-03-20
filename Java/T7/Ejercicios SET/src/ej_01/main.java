package ej_01;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        HashSet<Integer> objHashSet = new HashSet<Integer>();
        HashSet<Integer> objHashSet2 = new HashSet<Integer>();

        objHashSet.add(1);
        objHashSet.add(2);
        objHashSet.add(3);
        objHashSet.add(4);
        objHashSet.add(5);
        objHashSet.add(6);
        objHashSet.add(null);

        for (Integer i : objHashSet) {
            if (i != null) {
                if (i % 2 == 0) {
                    objHashSet2.add(i);
                }
            }
        }

        System.out.println("objHashSet2: " + objHashSet2);
    }
}
