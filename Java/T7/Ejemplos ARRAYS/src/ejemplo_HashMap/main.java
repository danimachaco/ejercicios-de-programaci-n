package ejemplo_HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        HashMap<Integer, String> objHashMap = new HashMap<>();

        objHashMap.put(1, "pepe");
        objHashMap.put(2, "pirry");
        objHashMap.put(3, "asier");
        objHashMap.put(4, "paco");
        objHashMap.put(5, null);
        objHashMap.put(6, null);

        System.out.println(objHashMap);
        System.out.println(objHashMap.values());
        System.out.println(objHashMap.entrySet());
        String resultado;

        for (Integer primarykey : objHashMap.keySet()) {
            resultado = objHashMap.get(primarykey);
            System.out.println(resultado.contains("p"));
        }


    }
}
