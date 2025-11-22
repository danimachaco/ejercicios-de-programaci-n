package ejercicio_6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        alumno objAlumno=new alumno();
        System.out.println("Elige una opcion");
        System.out.println("1: insertar Registro" + " " + "2: modificar Registro" + " " + "3: eliminar Registro");
        Scanner sc=new Scanner(System.in);
        int opcion= sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ingrese alumno");
                objAlumno.insertarRegistro("daniel","mate",4,5,4,5,4);
                objAlumno.calcularNotaPrimeraEvaluacion(4,5,4,5,4);
                break;
            case 2:
                System.out.println("Modifique el alumno");
                objAlumno.modificarRegistro("daniel","lengua",4,4,4,4,4);
                objAlumno.calcularNotaPrimeraEvaluacion(4,4,4,4,4);
                break;
            case 3:
                System.out.println("Elimine registro");
                objAlumno.eliminarRegistro();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }




    }
}
