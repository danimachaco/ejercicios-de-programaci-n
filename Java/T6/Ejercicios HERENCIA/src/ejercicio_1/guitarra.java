package ejercicio_1;

public class guitarra extends instrumento{
    private int numeroCuerdas;

    public  guitarra(int numeroCuerdas, String nombre, String tipo){
        super(nombre,tipo);
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public void tocar() {
        System.out.println(this.nombre+" suena rasgueando sus "+this.numeroCuerdas+" cuerdas");
    }
}
