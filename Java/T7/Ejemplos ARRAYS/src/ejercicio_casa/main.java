package ejercicio_casa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dime los alumnos de la clase");
        LinkedHashSet<String> listaalumos = new LinkedHashSet<>();
        LinkedHashSet<String> gruposdecuatro = new LinkedHashSet<>();
        String nombre = sc.nextLine();

        for (int i = 0; i < 11; i++) {
            nombre = sc.nextLine();
            listaalumos.add(nombre);
        }
        System.out.println(listaalumos);

        Random rand = new Random(12);
        int j = (int)(Math.random() * 12) + 1;


        for (int i = 0; i < 5; i++) {
            
        }

    }
}
