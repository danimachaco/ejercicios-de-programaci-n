import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        int numero;
        int contador = 0;
        int resultado = 1;
        System.out.print("Dame un numero");
        numero = myObject.nextInt();
        while (contador < numero) {
            contador++;
            resultado=resultado*contador;
        }
        System.out.println(resultado);
    }
}
