package ejemplo_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class main {
    public  static void main(String[] args) {
         HashSet<String> objHashSet = new HashSet<String>();

         objHashSet.add("Lunes");
         objHashSet.add("Martes");
         objHashSet.add("Viernes");
         objHashSet.add("Domingo");
         objHashSet.add(null);

         objHashSet.remove("Lunes");

         boolean existe= objHashSet.contains("Domingo");
         System.out.println(existe);

         System.out.println(objHashSet.isEmpty());

         //Iterator<String> objiterator = objHashSet.iterator();
        //while(objiterator.hasNext()){
        // System.out.println(objiterator.next());
        //}
        for (String pericopalotes :  objHashSet) {
            System.out.println(pericopalotes);
        }
    }
}
