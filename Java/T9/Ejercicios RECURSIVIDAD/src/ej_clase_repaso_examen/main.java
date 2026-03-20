package ej_clase_repaso_examen;

import java.util.ArrayList;
import java.io.IOException;

public class main {
    public static int gestion(ArrayList<alumno> palumnos) throws Exception{

        int suma = 0;

        for (alumno recorrer: palumnos){

            suma = suma + Integer.parseInt(recorrer.getEdad().toString());
        }
        return suma;
    }

    public static void main(String[] args) {

        alumno obj1 = new alumno ("daniel","rodri",18);
        alumno obj2 = new alumno ("aitor","pirry","6");
        alumno obj3 = new alumno ("asier","subnormal","18");
        alumno obj4 = new alumno ("cfg","gdfzb",20);


        ArrayList<alumno> objalumnos = new ArrayList<>();

        objalumnos.add(obj1);
        objalumnos.add(obj2);
        objalumnos.add(obj3);
        objalumnos.add(obj4);

        try {
            System.out.println(gestion(objalumnos));
        }catch (Exception e){
            System.out.println("Error principal: " + e.getMessage());

        }

    }
}
