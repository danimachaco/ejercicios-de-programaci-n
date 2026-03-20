package ej_01;

import java.util.Scanner;

public class main {

    public static int suma (int numero){

        if(numero <=0 ){

            return numero;

        }

        return numero + suma(numero-1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int numero = sc.nextInt();

        suma(numero);

        System.out.println("Suma: "+suma(numero));


    }
}
