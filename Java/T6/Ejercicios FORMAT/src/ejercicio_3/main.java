package ejercicio_3;

public class main {
    public static void main(String[] args) {
        String nombre="daniel";
        int puntuacion=100;
        String nombre2="paco";
        int puntuacion2=120;
        System.out.println(String.format("%-10s | %10d",nombre,puntuacion));
        System.out.println(String.format("%-10s | %10d",nombre2,puntuacion2));
    }
}
