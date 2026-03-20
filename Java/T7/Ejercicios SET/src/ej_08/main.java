package ej_08;

import java.util.Scanner;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("cuales son tus notas");
        TreeSet<Double> boletin= new TreeSet<Double>();

        double notas =sc.nextInt();

        while (notas>0){

            boletin.add(notas);
            notas=sc.nextDouble();

        }

        System.out.println("boletin: ");

        for (double s : boletin) {
            System.out.println(s);
        }
    }
}
