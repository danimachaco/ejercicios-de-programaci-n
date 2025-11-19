import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        System.out.println("Escribe la contraseña: ");
        String C = N.nextLine();
        String password = "admin123";
        if (password.equals(C)){
            System.out.println("Acceso concedido");
        }
        else {
            System.out.println("Acceso denegado");
        }
    }
}
