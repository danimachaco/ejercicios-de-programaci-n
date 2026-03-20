package ejemplo_02;

public abstract class vehiculo {
    protected String marca;

    public vehiculo(String marca) {
        this.marca = marca;
    }

    abstract void mover();

    void info(){
        System.out.println("Marca: "+marca);
    }
}
