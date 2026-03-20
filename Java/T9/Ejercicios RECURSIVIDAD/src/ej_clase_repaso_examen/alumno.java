package ej_clase_repaso_examen;

public class alumno<V> {

    String nombre;
    String apellido;
    V edad;

    public alumno(String nombre, String apellido, V edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public V getEdad() {
        return edad;
    }
    public void setEdad(V edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
