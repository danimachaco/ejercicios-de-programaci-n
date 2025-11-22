package ejercicio_1;

public class alumno {
    private String nombre;
    private int notaAsignatura;

    public alumno() {
    }
    public alumno(String nombre, int notaAsignatura) {
        this.nombre = nombre;
        this.notaAsignatura = notaAsignatura;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNotaAsignatura() {
        return notaAsignatura;
    }
    public void setNotaAsignatura(int notaAsignatura) {
        this.notaAsignatura = notaAsignatura;
    }
    public boolean aprobadoSuspenso(int variableNota) {
        boolean resultado = true;
        if (5<=variableNota && variableNota<=10) {
            resultado = true;
        }
        else  {
            resultado = false;
        }
        return resultado;
    }
    public void mostrarInformacion() {
        System.out.println(this.nombre+" "+" "+this.notaAsignatura);
    }
}
