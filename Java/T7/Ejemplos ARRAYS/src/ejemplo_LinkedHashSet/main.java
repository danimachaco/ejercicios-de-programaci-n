package ejemplo_LinkedHashSet;

import java.util.LinkedHashSet;

public class main {
    public static void main(String[] args) {
        LinkedHashSet<String> objLinkedHashSet = new LinkedHashSet<String>();
        objLinkedHashSet.add("Lunes");
        objLinkedHashSet.add("Martes");
        objLinkedHashSet.add("Miercoles");
        objLinkedHashSet.add("Jueves");
        objLinkedHashSet.add(null);
        objLinkedHashSet.add("Viernes");
        objLinkedHashSet.add(null);

        objLinkedHashSet.remove("jueves");

        boolean existe= objLinkedHashSet.contains("jueves");
        System.out.println(existe);

        System.out.println(objLinkedHashSet);

        for ( String pericopalotes :  objLinkedHashSet) {
            System.out.println(pericopalotes);
        }


    }
}
