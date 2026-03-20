package ej_03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Escribe las columnas");
            int columnas=sc.nextInt();
            int[][] matriz = new int[5][columnas];

            for(int i = 0 ; i < matriz.length ; i ++){
                for(int j = 0 ; j < matriz[i].length ; j ++){
                    int xx = (int) (Math.random() * 11);
                    matriz[i][j]=xx;
                }
            }
            System.out.println(Arrays.deepToString(matriz));
        } catch(IndexOutOfBoundsException e){
            System.out.println("no cabe: " + e.getMessage());
        }
    }
}
