package ejercicio_5;

import java.time.Duration;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        String frase = "La reunión empieza a las 10:30 y termina a las 15:45 ";

        String horasInicio = frase.substring(25,27);
        String minutosInicio = frase.substring(28,30);

        String horasFin = frase.substring(47,49);
        String minutosFin = frase.substring(50,52);

        int hInicio = Integer.parseInt(horasInicio);
        int hFin = Integer.parseInt(horasFin);
        int mInicio = Integer.parseInt(minutosInicio);
        int mFin = Integer.parseInt(minutosFin);

        LocalTime reunionInicio =LocalTime.of(hInicio,mInicio);
        LocalTime reunionFin =LocalTime.of(hFin,mFin);

        Duration reunion = Duration.between(reunionInicio,reunionFin);

        System.out.println("La reunion dura "+reunion.toHours()+" horas y "+reunion.toMinutes()%60+" minutos" );
    }
}
