import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UjDatumok {

    public static void main(String[] args) {

        // Java 8 előtt Gregoian Calendar
        // Java 8+ LocalDate, LocalDateTime, Duration, Period, stb.

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("Aktuális dátum: " + ld.toString());
        System.out.println("Aktuális idő: " + lt.toString());
        System.out.println("Aktuális dátum és idő: " + ldt.toString());

    }

}
