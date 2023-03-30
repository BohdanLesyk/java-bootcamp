package round_2.lesson7;

import java.util.*;

public class Handler {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.createListOfPersons();

        System.out.print("List of persons: \t");
        System.out.println(personController.personList);

        Scanner scanner = new Scanner(System.in);
        String usersChoice;
        boolean isContinueSort = true;

        while (isContinueSort) {
            System.out.println("Please, choose sort option for persons:");
            System.out.println("1. region -> name -> isMale -> birthYear");
            System.out.println("2. birthYear -> isMale -> name -> region");
            System.out.println("3. isMale -> name -> region -> birthYear");
            System.out.println("0. Exit program");

            usersChoice = scanner.next();

            if (usersChoice.equals("0")) {
                isContinueSort = false;
                continue;
            }

            if (!usersChoice.equals("1") && !usersChoice.equals("2") && !usersChoice.equals("3")) {
                System.out.println("Collection will sort by default order!");
                System.out.println("Default order: name -> region -> birthYear -> isMale");
            }

            personController.sortPersonList(usersChoice);
            System.out.println(personController.personList);
        }
    }
}
