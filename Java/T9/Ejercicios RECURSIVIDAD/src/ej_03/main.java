package ej_03;

import java.util.Scanner;

public class main {

    public static void escribir(int opcion){

        if(opcion==0){
            return;
        }

        System.out.println(opcion+" ");

        escribir(opcion-1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        escribir(opcion);

    }
}
