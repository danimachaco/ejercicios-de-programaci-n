package ej_clase_genericos2;

public class main {
    public static void main(String[] args) {

        persona<Integer> persona1 = new persona<Integer>("Somos", "Hackers de la Programacion", 32);
        persona<Double> persona2 = new persona<Double>("Somos", "Hackers de la Programacion", 32.3);

        System.out.println(persona1.getEdad());
        System.out.println(persona2.getEdad());
    }
}
