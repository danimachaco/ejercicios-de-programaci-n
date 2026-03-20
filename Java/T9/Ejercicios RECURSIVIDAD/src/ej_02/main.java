package ej_02;

import java.util.Scanner;

public class main {

    public static void escribir(int numero){

        if (numero == 0){
            return;
        }

        escribir(numero-1);

        System.out.println(numero + " ");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la opcion: ");
        int opcion = sc.nextInt();

        escribir(opcion);
    }
}
