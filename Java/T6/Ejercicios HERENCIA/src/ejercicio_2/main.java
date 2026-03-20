package ejercicio_2;

public class main {
    public static void main(String[] args) {
        figura objfigura = new figura("negro");
        circulo objcirculo =new circulo (50.2,"blanco");
        rectangulo objrectangulo = new rectangulo("marron",50,40);

        objcirculo.calcularArea();
        objrectangulo.calcularArea();
        objfigura.calcularArea();


    }
}
