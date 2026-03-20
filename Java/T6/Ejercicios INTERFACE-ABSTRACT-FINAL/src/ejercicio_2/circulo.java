package ejercicio_2;

public class circulo extends figura{
    double radio;
    public circulo(double lado) {
        this.radio = lado;
    }
    @Override
    double area() {
        double resultado2=radio*radio*Math.PI;
        System.out.println("area del circulo: "+resultado2);
        return resultado2;
    }
}
