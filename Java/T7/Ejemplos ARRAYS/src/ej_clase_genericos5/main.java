package ej_clase_genericos5;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        alumno pepe = new alumno ("pepe","cvghb","mate",9);
        alumno pirry = new alumno ("djstg","l","lengua",9.5);
        alumno yo = new alumno ("yo","el","vyg","tuputamadre");

        ArrayList<alumno> alumnos = new ArrayList<alumno>();
        alumnos.add(pepe);
        alumnos.add(pirry);
        alumnos.add(yo);

    }

//    public static <String> ArrayList convertirNombres(String[] arrayAlumno){
//
//        for (String x : arrayAlumno){
//            cogerNombre = arrayAlumno.getNombre();
//            cogerNombre = x;
//        }
//
//    }
}
