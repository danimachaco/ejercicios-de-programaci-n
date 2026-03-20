package ejercicio_2;

import java.time.Duration;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(10,30);
        LocalTime end = LocalTime.of(15,45);
        Duration duration = Duration.between(start, end);
        System.out.println(duration.toHours()+" horas"+" "+ "y" +" "+ duration.toMinutes()%60+" minutos");
    }
}
