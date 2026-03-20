package ej_12;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        alumnos objalumno = new alumnos ("paco ","paquez");
        alumnos objalumno2 = new alumnos ("miguel ","garcia");
        alumnos objalumno3 = new alumnos ("marcos ","sanchez");
        alumnos objalumno4 = new alumnos ("yo ","yo");


        ArrayList<alumnos> lista = new ArrayList <alumnos>();

        lista.add(objalumno);
        lista.add(objalumno2);
        lista.add(objalumno3);

        System.out.println("lista de alumnos: ");

        System.out.println(lista.get(0).getNombre() + " " + lista.get(0).getApellido());
        System.out.println(lista.get(1).getNombre() + " " + lista.get(1).getApellido());
        System.out.println(lista.get(2).getNombre() + " " + lista.get(2).getApellido());

        System.out.println("lista de alumnos modificada: ");

        lista.set(0, objalumno4);

        System.out.println(lista.get(0).getNombre() + " " + lista.get(0).getApellido());
        System.out.println(lista.get(1).getNombre() + " " + lista.get(1).getApellido());
        System.out.println(lista.get(2).getNombre() + " " + lista.get(2).getApellido());

    }
}
