package ejemplo_clase;

public class animal {
     String nombre;
    private int patas;

    public animal() {}
    public animal(String nombre, int patas) {
        this.patas = patas;
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void  hacerSonido(){
        System.out.println(this.nombre+" hace sonido");
    }
}
