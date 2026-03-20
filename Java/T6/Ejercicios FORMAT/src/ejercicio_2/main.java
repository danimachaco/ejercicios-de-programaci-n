package ejercicio_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner objprecio=new Scanner(System.in);
        System.out.println("cuanto cuesta");
        double cuesta=objprecio.nextDouble();
        System.out.printf(String.format("el precio es "+ "%.2f€%n",cuesta));

    }
}
