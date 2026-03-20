package ejercicio_3;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class main {
    public static void main(String[] args) {
        ZonedDateTime Madrid = ZonedDateTime.now();
        ZonedDateTime Newyork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(Madrid);
        System.out.println(Newyork);
    }
}
