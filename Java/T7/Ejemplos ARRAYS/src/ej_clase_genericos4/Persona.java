package ej_clase_genericos4;

public class Persona <V, V2, V3> {

    private V2 nombre;
    private V3 apellidos;
    private V edad;
    public Persona(V2 nombre, V3 apellidos, V edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public V2 getNombre() {
        return nombre;
    }
    public void setNombre(V2 nombre) {
        this.nombre = nombre;
    }

    public V3 getApellidos() {
        return apellidos;
    }
    public void setApellidos(V3 apellidos) {
        this.apellidos = apellidos;
    }
    public V getEdad() {
        return edad;
    }
    public void setEdad(V edad) {
        this.edad = edad;
    }
}
