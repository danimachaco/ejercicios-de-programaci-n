package ejemplo_TreeSet;

import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        TreeSet<String> objTreeSet = new TreeSet<String>();
        objTreeSet.add("Lunes");
        objTreeSet.add("Martes");
        objTreeSet.add("Miercoles");
        objTreeSet.add("Jueves");
        objTreeSet.add("Viernes");
        //objTreeSet.add(null);
        objTreeSet.add("Viernes");



        System.out.println(objTreeSet);

        TreeSet<Integer> obj2 = new TreeSet<Integer>();
        obj2.add(1);
        obj2.add(5);
        obj2.add(2);
        obj2.add(3);
        obj2.add(6);
        obj2.add(4);
        obj2.add(9);


       boolean existe=  obj2.contains(8);
        System.out.println(obj2);
        System.out.println(existe);
        System.out.println(obj2.floor(8));
        System.out.println(obj2.ceiling(8));

    }
}
