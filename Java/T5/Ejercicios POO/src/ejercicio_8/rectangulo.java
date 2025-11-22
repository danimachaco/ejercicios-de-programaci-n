package ejercicio_8;

public class rectangulo {
    private double ancho;
    private double alto;

    public rectangulo(){}
    public rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea(){
        double resultado1 = ancho*alto;
        return resultado1;
    }
    public double calcularPerimetro(){
        double resultado2 = ancho*2*alto;
        return resultado2;
    }
    public void mostrarDimensiones(){
        System.out.println("Area: " + calcularArea() + " " + "Perimetro: " + calcularPerimetro());

    }
}
