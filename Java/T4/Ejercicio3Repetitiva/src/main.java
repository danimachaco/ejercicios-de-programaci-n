import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String letra;
        do {
            System.out.print(" Dame caracteres ");
            Scanner myletter = new Scanner(System.in);
            letra = myletter.nextLine();
            switch (letra) {
                case "a","e","i","o","u":
                    System.out.println("Vocal");
                    break;
                case " ":
                    break;
                default:
                    System.out.println("Consonante");
                    break;
            }
        }
        while (!Objects.equals(letra, " "));
    }
}

