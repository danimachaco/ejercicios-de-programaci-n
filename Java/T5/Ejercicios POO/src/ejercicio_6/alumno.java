package ejercicio_6;

public class alumno {
    private String nombre;
    private String nombreAsugnatura;
    private double notaParcial1Examen;
    private double notaParcial2Examen;
    private double notaExposicion;
    private double notaEjercicios;
    private double notaTrabajoClase;

    public alumno() {}

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreAsugnatura() {
        return nombreAsugnatura;
    }
    public void setNombreAsugnatura(String nombreAsugnatura) {
        this.nombreAsugnatura = nombreAsugnatura;
    }
    public double getNotaParcial1Examen() {
        return notaParcial1Examen;
    }
    public void setNotaParcial1Examen(double notaParcial1Examen) {
        this.notaParcial1Examen = notaParcial1Examen;
    }
    public double getNotaParcial2Examen() {
        return notaParcial2Examen;
    }
    public void setNotaParcial2Examen(double notaParcial2Examen) {
        this.notaParcial2Examen = notaParcial2Examen;
    }
    public double getNotaExposicion() {
        return notaExposicion;
    }
    public void setNotaExposicion(double notaExposicion) {
        this.notaExposicion = notaExposicion;
    }
    public double getNotaEjercicios() {
            return  notaEjercicios;
    }
    public void setNotaEjercicios(double notaEjercicios) {
        this.notaEjercicios = notaEjercicios;
    }
    public double getNotaTrabajoClase() {
        return notaTrabajoClase;
    }
    public void setNotaTrabajoClase(double notaTrabajoClase) {
        this.notaTrabajoClase = notaTrabajoClase;
    }

    public void insertarRegistro(String nombre,String nombreAsugnatura, double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajoClase) {
        this.nombre=nombre;
        this.nombreAsugnatura=nombreAsugnatura;
        this.notaParcial1Examen=notaParcial1Examen;
        this.notaParcial2Examen=notaParcial2Examen;
        this.notaExposicion=notaExposicion;
        this.notaEjercicios=notaEjercicios;
        this.notaTrabajoClase=notaTrabajoClase;

        System.out.println("Nombre: "+this.nombre);
        System.out.println("NombreAsugnatura: "+this.nombreAsugnatura);
        System.out.println("Nota Parcial1: "+this.notaParcial1Examen);
        System.out.println("Nota Parcial2: "+this.notaParcial2Examen);
        System.out.println("Nota Exposicion: "+this.notaExposicion);
        System.out.println("Nota Ejercicio: "+this.notaEjercicios);
        System.out.println("Nota Trabajo clase: "+this.notaTrabajoClase);
    }

    public void modificarRegistro(String nombre,String nombreAsugnatura, double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajoClase){
        this.nombre=nombre;
        this.nombreAsugnatura=nombreAsugnatura;
        this.notaParcial1Examen=notaParcial1Examen;
        this.notaParcial2Examen=notaParcial2Examen;
        this.notaExposicion=notaExposicion;
        this.notaEjercicios=notaEjercicios;
        this.notaTrabajoClase=notaTrabajoClase;

        System.out.println("Nombre: "+this.nombre);
        System.out.println("NombreAsugnatura: "+this.nombreAsugnatura);
        System.out.println("Nota Parcial1: "+this.notaParcial1Examen);
        System.out.println("Nota Parcial2: "+this.notaParcial2Examen);
        System.out.println("Nota Exposicion: "+this.notaExposicion);
        System.out.println("Nota Ejercicio: "+this.notaEjercicios);
        System.out.println("Nota Trabajo clase: "+this.notaTrabajoClase);
    }

    public void eliminarRegistro(){
        this.nombre=null;
        this.nombreAsugnatura=null;
        this.notaParcial1Examen=0;
        this.notaParcial2Examen=0;
        this.notaExposicion=0;
        this.notaEjercicios=0;
        this.notaTrabajoClase=0;

        System.out.println("Nombre: "+this.nombre);
        System.out.println("NombreAsugnatura: "+this.nombreAsugnatura);
        System.out.println("Nota Parcial1: "+this.notaParcial1Examen);
        System.out.println("Nota Parcial2: "+this.notaParcial2Examen);
        System.out.println("Nota Exposicion: "+this.notaExposicion);
        System.out.println("Nota Ejercicio: "+this.notaEjercicios);
        System.out.println("Nota Trabajo clase: "+this.notaTrabajoClase);
    }

    public double calcularNotaPrimeraEvaluacion(double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajoClase){
        double resultado= ((notaEjercicios)+(notaParcial1Examen)+(notaParcial2Examen)+(notaExposicion)+(notaTrabajoClase))/5;
        System.out.println("Nota Primera Evaluacion: "+resultado);
        return resultado;
    }
}
