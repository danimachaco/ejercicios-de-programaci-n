package ejercicio_1;

public class instrumento {
    String nombre;
    String tipo;

    public instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void tocar(){
        System.out.println("TOCAR");
    }
}
