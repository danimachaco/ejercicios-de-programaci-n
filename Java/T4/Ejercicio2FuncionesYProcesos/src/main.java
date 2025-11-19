import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myletter = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        String nombre = myletter.nextLine();
        saludo(nombre);

    }
    public static void saludo(String variableSaludo){
        String saludo = variableSaludo;
        System.out.println("Hola " +saludo+ " !bienvenido a java¡");
    }
}
