package round_2.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonController {
    protected List<Person> personList;

    public void createListOfPersons() {
        personList = new ArrayList<>(List.of(
                new Person("Bohdan", "Lviv", 2000, true),
                new Person("Andrii", "Vinnytsa", 1998, true),
                new Person("Serg", "Kyiv", 1980, true),
                new Person("Mary", "Chernivtsi", 1985, false),
                new Person("Dmytro", "Sumy", 1996, true),
                new Person("Ivanka", "Uzhdorod", 2004, false),
                new Person("Bohdan", "Lviv", 1995, true),
                new Person("Mary", "Mykolaiv", 1999, false),
                new Person("Anastasiia", "Odessa", 2000, false),
                new Person("Victoriia", "Chernigiv", 1998, false)
        ));
    }

    public void sortPersonList(String usersChoice) {
        switch (usersChoice) {
            case "1" -> personList.sort(new Person.ComparatorByRegionNameIsMaleBirthYear());
            case "2" -> personList.sort(new Person.ComparatorByBirthYearIsMaleNameRegion());
            case "3" -> personList.sort(new Person.ComparatorByIsMaleNameRegionBirthYear());
            default -> Collections.sort(personList);
        }
    }
}
