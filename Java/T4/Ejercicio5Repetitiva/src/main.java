import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*50);
        int contador = 0;
        int numero;
        do {
            Scanner my = new Scanner(System.in);
            System.out.println("Adivina el numero");
            numero= my.nextInt();
            contador++;
            switch (numero) {
                case aleatorio > numero:
                    System.out.println("El numero alatorio es mayor");
                    break;
                case numero > aleatorio :
                    System.out.println("El numero aleatorio es menor");
                    break;
                case numero == aleatorio:
                    System.out.println("acertaste");
                    System.out.println(contador);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            contador++;

        }
        while (contador<=5||numero!=aleatorio);
    }
}
