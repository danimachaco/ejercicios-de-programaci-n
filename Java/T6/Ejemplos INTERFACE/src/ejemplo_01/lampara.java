package ejemplo_01;

public class lampara implements encendible{
    @Override
    public void encender(){
        System.out.println("lampara encender");
    }
    @Override
    public void apagar(){
        System.out.println("lampara apagar");
    }
    //public String prueba(){}
    //public double prueba2(String resultado){}

}
