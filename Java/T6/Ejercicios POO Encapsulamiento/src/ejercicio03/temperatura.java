package ejercicio03;

public class temperatura {
    private double temperaturaCelsius;
    //temperatura =((celsius * 9/5)+32)
    public temperatura(){
        temperaturaCelsius = this.temperaturaCelsius;
    }

    public double getTemperaturaCelsius(){
        return temperaturaCelsius;
    }
    public void setTemperaturaCelsius(double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double calcularTemperatura(){
        double resultado =((this.temperaturaCelsius * 9/5)+32);
        return resultado;
    }
}
