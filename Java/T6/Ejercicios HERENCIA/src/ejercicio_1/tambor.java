package ejercicio_1;

public class tambor extends instrumento {
    private double diametro;

    public tambor(double diametro, String nombre, String tipo) {
        super(nombre,tipo);
        this.diametro = diametro;
    }

    @Override
    public void tocar() {
        System.out.println(this.nombre+" suena al golpear su membrana de " + this.diametro +" cm");
    }
}
