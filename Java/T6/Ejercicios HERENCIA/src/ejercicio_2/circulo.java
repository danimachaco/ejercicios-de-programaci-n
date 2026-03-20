package ejercicio_2;

public class circulo extends figura{
    private double radio;

    public circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        double area = Math.PI * this.radio*this.radio ;
        System.out.println("color: " + color);
        System.out.println("el area es: " + area);
    }
}
