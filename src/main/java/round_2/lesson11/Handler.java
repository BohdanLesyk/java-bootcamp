package round_2.lesson11;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Handler {
    public static void main(String[] args) {
        Car bmw = new Car("BMW X3");
        Car opel = new Car("Opel Mokka");
        Car ford = new Car("Ford Puma");

        bmw = new Car("BMW X6 GTM");
        opel = new Car("Opel Astra");
        ford = new Car("Ford Kuga");

        System.gc();
        System.out.println("Line after `System.gc();`");

        bmw = null;
        opel = null;
        ford = null;

        System.out.println("Line after `object = null;`");
        System.gc();

        //----------------------------------------------------------------------------//

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // set to start of month
        DayOfWeek weekday = date.getDayOfWeek();

        int value = weekday.getValue(); // 1 = Monday, . . . , 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("  ");
        }
        
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());

            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            
            date = date.plusDays(1);
            
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }

        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
