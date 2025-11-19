import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner dato1 = new Scanner(System.in);
        System.out.print("Cual es la base: ");
        int numero1 = dato1.nextInt();
        Scanner dato2 = new Scanner(System.in);
        System.out.print("Cual es la altura: ");
        int numero2 = dato2.nextInt();
        System.out.print(area(numero1, numero2));
    }
    public static int area(int base, int altura){
        int resultadofinal = ((base*altura)/2);
        return resultadofinal;
    }
}
