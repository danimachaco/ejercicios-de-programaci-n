package ej_04;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            int xx = (int) (Math.random() * 101);
            numero[i] =xx;
            cuadrado[i] = numero[i]*numero[i];
            cubo[i] = numero[i]*numero[i]*numero[i];
            System.out.println(numero[i]+ " " +cuadrado[i]+" " +cubo[i]);

        }
    }
}
