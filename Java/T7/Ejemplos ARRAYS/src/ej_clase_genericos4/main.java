package ej_clase_genericos4;

public class main {
    public static void main(String[] args) {

        Persona pirry = new Persona (false,"56.7",5);
        Persona pericopalotes = new Persona (45842,false,"maria");
        Persona asier = new Persona (9d,33.3,true);

        System.out.print(pirry.getNombre() + " ");
        System.out.print(pirry.getApellidos() + " ");
        System.out.println(pirry.getEdad());

        System.out.print(pericopalotes.getNombre() + " ");
        System.out.print(pericopalotes.getApellidos() + " ");
        System.out.println(pericopalotes.getEdad());

        System.out.print(asier.getNombre() + " ");
        System.out.print(asier.getApellidos() + " ");
        System.out.println(asier.getEdad());

    }
}
