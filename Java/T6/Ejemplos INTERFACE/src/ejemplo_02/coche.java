package ejemplo_02;

public class coche extends vehiculo{

    public coche(String marca){
        super(marca);
    }

    @Override
    public void mover(){
        System.out.println("mover coche");
    }

    @Override
    void info(){
        super.info();
    }
}
