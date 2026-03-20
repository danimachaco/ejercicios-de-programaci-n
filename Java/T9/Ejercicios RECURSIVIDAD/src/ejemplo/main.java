package ejemplo;

import java.util.Scanner;

public class main {

    public static int funcionRecursiva (int numero){

        if(numero <=0 ){

            System.out.println("termino");
            return 1;

        }
        System.out.println(numero);

        return funcionRecursiva(numero-1);

    }

    public static int funcionNormal(int numero){

        while (numero > 0){
            System.out.println(numero);
            numero = numero - 1;
        }

        return numero;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        int salida = funcionRecursiva(numero);
        int salida2 = funcionNormal(numero);

        System.out.println(salida);

    }
}
