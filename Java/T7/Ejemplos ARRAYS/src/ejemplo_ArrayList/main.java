package ejemplo_ArrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList <Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(null);
        lista.add(null);

      //  System.out.println(lista.get(3));
        lista.set(3,10);
        //System.out.println(lista.get(3));

       // System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            //System.out.println(lista.get(i));
        }

        for (Integer j : lista) {
            //System.out.println(j);
        }
        System.out.println(lista.lastIndexOf(5));
    }
}
