package ej_clase_genericos2;

public class persona <V> {
    private String nom;
    private String ap;
    private V edad;
    public persona(String nomb, String ap, V edad) {
        this.nom = nom;
        this.ap = ap;
        this.edad = edad;
    }
    public V getEdad() {
        return edad;
    }
    public void setEdad(V edad) {
        this.edad = edad;
    }
}
