package ejercicio_5;

public class microondas implements programable {
    protected boolean funcionando;
    protected int tiempoRestante;

    public void iniciarPrograma(int minutos) {
        System.out.println("Iniciando microondas : "+minutos+" minutos");
        funcionando = true;
    }
    public void detenerPrograma() {
        funcionando = false;
        tiempoRestante = 0;
        System.out.println("Calentado");
    }
    public boolean enFuncionamiento() {
        System.out.println("Funcionando: " + funcionando);
        return funcionando;
    }
}
