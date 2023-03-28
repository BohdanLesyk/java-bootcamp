package round_2.lesson3.task2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Handler {
    public static void main(String[] args) {
        GregorianCalendar beginWW2 = new GregorianCalendar(1939, Calendar.SEPTEMBER, 1);
        GregorianCalendar endWW2 = new GregorianCalendar(1945, Calendar.SEPTEMBER, 2);
        int warDurationInYears = endWW2.get(Calendar.YEAR) - beginWW2.get(Calendar.YEAR),
                warDurationInMonths = endWW2.get(Calendar.MONTH) - beginWW2.get(Calendar.MONTH),
                warDurationInDays = endWW2.get(Calendar.DAY_OF_MONTH) - beginWW2.get(Calendar.DAY_OF_MONTH) + 1;

        System.out.println("WW2 continued " + warDurationInYears + " years, " + warDurationInMonths + " months, " +
                warDurationInDays + " days.");
    }
}
