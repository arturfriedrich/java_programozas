import java.text.DateFormat;
import java.util.*;

public class DatumTeszt {

    public static void main(String [] args) {

        // klasszikus dátumkezelés
        Date most = new Date();
        System.out.println(most);

        System.out.println(TimeZone.getTimeZone("EST"));
        System.out.println(TimeZone.getTimeZone("CET"));

        System.out.println("---------------------------------");
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeZone(TimeZone.getTimeZone("EST"));      // calendar időzóna beállítása
        System.out.println(calendar.getTime());

        GregorianCalendar calendar2 = new GregorianCalendar(2000, Calendar.JANUARY, 1, 23, 61);

        calendar2.setFirstDayOfWeek(Calendar.MONDAY);

        System.out.println(calendar2.getTime());
        System.out.println(calendar2.getWeeksInWeekYear());
        System.out.println(calendar2.getTime());
        System.out.println(calendar2.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(calendar2.get(GregorianCalendar.YEAR));
        System.out.println("---------------------------------");

        // Locale - nyelvi beállítások
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("en", "US"));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, new Locale("es", "ES"));
        System.out.println(df.format(most));
        System.out.println(df2.format(most));

    }

}
