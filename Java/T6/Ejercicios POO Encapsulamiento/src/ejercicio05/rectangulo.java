package ejercicio05;

public class rectangulo {
    private double altura;
    private double ancho;

    public rectangulo() {
        this.altura = altura;
        this.ancho = ancho;
    }
    public rectangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (this.altura>=0){
            this.altura = altura;
        }
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        if (this.ancho>=0){
            this.ancho = ancho;
        }
    }

    public double getarea() {
        double resultado = (this.altura * this.ancho)/2;
        return resultado;
    }
}
