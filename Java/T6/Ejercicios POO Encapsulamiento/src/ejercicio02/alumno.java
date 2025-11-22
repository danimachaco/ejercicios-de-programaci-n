package ejercicio02;

public class alumno {
    private double nota;

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Alumno: " +this.nota);
        }
    }
}
