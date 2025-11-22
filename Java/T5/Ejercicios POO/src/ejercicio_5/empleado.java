package ejercicio_5;

public class empleado {
    private String nombre;
    private double sueldo;

    public  empleado() {}
    public empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public  void aplicarIncremento(double porcentaje) {
        double resultado = this.sueldo + ((porcentaje*this.sueldo)/100);
        this.sueldo = resultado;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Sueldo actual: "+this.sueldo);
    }
}
