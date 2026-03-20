package ejemplo_01;

public class ordenador implements encendible{
    @Override
    public void encender(){
        System.out.println("encendiendo...");
    }
    @Override
    public void apagar(){
        System.out.println("apagando...");
    }
}
