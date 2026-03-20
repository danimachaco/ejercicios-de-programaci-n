package ejercicio_3;

public class libro extends producto{
    private String autor;

    public libro(String nombre,double precio, String autor){
        super(nombre,precio);
        this.autor=autor;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: "+autor);
    }
}
