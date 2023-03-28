package round_2.lesson3.task1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Handler {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar(2022, Calendar.JULY, 20);

        for (int i = 0; i < 5; i++) {
            gc.add(Calendar.YEAR, 1);
            System.out.println("Year: " + gc.get(Calendar.YEAR) + "; Day of week: "
                    + gc.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));
        }
    }
}
