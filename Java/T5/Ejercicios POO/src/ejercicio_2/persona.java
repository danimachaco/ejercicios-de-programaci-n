package ejercicio_2;

public class persona {
    private String nombre;
    private int edad;

    public persona(){}
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean mayorEdad(int variableEdad){
        boolean resultado=true;
        if(variableEdad>=18){
            resultado=true;
        }
        else {
            resultado=false;
        }
        return resultado;
    }
    public void mostrarInformacion(){
        System.out.println(this.nombre+" "+this.edad+" "+mayorEdad(this.edad));
    }
}
