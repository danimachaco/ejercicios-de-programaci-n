package ejercicio_1;

public class lampara implements encendible{
    @Override
    public void encender() {
        System.out.println("encender lampara");
    }
    @Override
    public void apagar() {
        System.out.println("apagar lampara");
    }
}
