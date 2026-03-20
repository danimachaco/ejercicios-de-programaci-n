package ej_clase_genericos5;

public class alumno <V>{

    public String nombre;
    public String apellidos;
    public String asignatura;
    public V nota;

    public alumno (String nombre, String apellidos, String asignatura, V nota){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignatura = asignatura;
        this.nota = nota;

    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public V getNota() {
        return nota;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }
    public void setNota(V nota){
        this.nota = nota;
    }


}
