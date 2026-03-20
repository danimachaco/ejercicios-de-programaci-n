package ejemplo_clase;

public class perro extends animal {
    private String raza;

    public perro(String raza, String nombre, int patas) {
        this.raza = raza;
        super(nombre, patas);
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrarInfo(){
        System.out.println("Raza: "+this.raza);
        System.out.println("Nombre: "+this.nombre);

    }
}
