package round_2.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Handler {
    public static void main(String[] args) {
        List<Fest> festList = new ArrayList<>(Arrays.asList(
                new Fest("Fest 1", "Lviv", YearMonth.APRIL),
                new Fest("Fest 3", "Kyiv", YearMonth.AUGUST),
                new Fest("Fest 2", "Odessa", YearMonth.DECEMBER),
                new Fest("Fest 4", "Vinnytsa", YearMonth.NOVEMBER),
                new Fest("Fest 7", "Dnipro", YearMonth.JULY),
                new Fest("Fest 6", "Kharkiv", YearMonth.MAY)
        ));

        festList.sort(new Fest.ComparatorByCity());
        System.out.println(festList);

        festList.sort(new Fest.ComparatorByMonth());
        System.out.println(festList);

        Collections.sort(festList);
        System.out.println(festList);
    }
}
