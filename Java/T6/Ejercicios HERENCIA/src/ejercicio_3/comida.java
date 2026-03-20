package ejercicio_3;

import ejercicio_2.circulo;

import java.sql.Date;

public class comida extends producto {
    String fechaCaducidad;

    public comida(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de caducidad: "+fechaCaducidad);
    }
}
