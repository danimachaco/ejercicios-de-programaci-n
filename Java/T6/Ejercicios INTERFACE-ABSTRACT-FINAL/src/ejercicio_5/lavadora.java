package ejercicio_5;

public class lavadora implements programable {

    protected boolean funcionando;
    protected int tiempoRestante;


    public void iniciarPrograma(int minutos) {
        System.out.println("Duracion del programa: "+minutos+" minutos");
        funcionando = true;
        System.out.println("Funcionando "+funcionando);
    }
    public void detenerPrograma() {
        funcionando = false;
        tiempoRestante = 0;
        System.out.println("Fin del programa");
        System.out.println("Funcionando "+funcionando);
    }
    public boolean enFuncionamiento() {
        return funcionando;
    }
}
