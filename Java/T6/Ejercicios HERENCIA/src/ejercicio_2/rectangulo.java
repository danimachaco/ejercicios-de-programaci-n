package ejercicio_2;

public class rectangulo extends figura{
    private double alto;
    private double largo;
    public rectangulo(String color, double alto, double largo) {
        super(color);
        this.alto = alto;
        this.largo = largo;
    }
    public void calcularArea(){
        super.calcularArea();
        double areaR = alto*largo;
        System.out.println("color: " + color);
        System.out.println("el area es: " + areaR);
    }
}
