package ej_04;

import java.util.HashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombres");
        HashSet<String> listanombres = new HashSet<String>();
        String nombres = sc.nextLine();
        String salir = "fin";

        while (!nombres.equals(salir)) {
            listanombres.add(nombres);
            nombres = sc.nextLine();
        }

        System.out.println(listanombres );

    }
}
