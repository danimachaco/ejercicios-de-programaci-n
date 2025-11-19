import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner myobject = new Scanner(System.in);
        System.out.println("¿Que nota has sacado?");
        int nota=myobject.nextInt();
        switch (nota){
            case 0,1,2,3,4:
                System.out.println("Has suspendido");
                break;
            case 5,6:
                System.out.println("Has aprobado");
                break;
            case 7,8:
                System.out.println("Has sacado un notable");
                break;
            case 9,10:
                System.out.println("Has sacado un sobresaliente");
            break;
        }
    }
}
