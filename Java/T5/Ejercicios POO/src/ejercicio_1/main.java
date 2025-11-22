package ejercicio_1;

public class main {
    public static void main(String[] args) {
        alumno objAlumno1 = new alumno("Daniel", 8);
        boolean resultado1= objAlumno1.aprobadoSuspenso(objAlumno1.getNotaAsignatura());
        System.out.println(resultado1);
        objAlumno1.mostrarInformacion();

        alumno objAlumno2 = new alumno("Aitor", 3);
        boolean resultado2= objAlumno2.aprobadoSuspenso(objAlumno2.getNotaAsignatura());
        System.out.println(resultado2);
        objAlumno2.mostrarInformacion();
    }
}
