package ejercicio_7;

public class persona {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String dni;

    public persona() {}
    public persona(String nombre, String apellido, String fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+this.nombre+" "+ " Apellido: "+this.apellido +" "+ "Fecha de nacimiento: "+this.fechaNacimiento+" "+"Dni: "+this.dni);
    }
}
