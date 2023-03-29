package round_2.lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class Handler {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Petro", new ArrayList<>(Arrays.asList(4, 4, 5, 5, 3, 5, 5))),
                        new Student("Ann", new ArrayList<>(Arrays.asList(4, 4, 5, 5, 3, 5, 5))),
                        new Student("Victoria", new ArrayList<>(Arrays.asList(4, 4, 5, 5, 3, 5, 5))),
                        new Student("Max", new ArrayList<>(Arrays.asList(4, 4, 5, 5, 3, 5, 5))),
                        new Student("Bohdan", new ArrayList<>(Arrays.asList(4, 4, 5, 5, 3, 5, 5)))
                )
        );

        Group studentsGroup = new Group("group 1", students);
        studentsGroup.studyOver();

        System.out.println(studentsGroup);

        students.get(0).getMarks().add(7);
        studentsGroup.getStudents().add(
                new Student("Mary", new ArrayList<>(Arrays.asList(4, 4, 5, 5, 3, 5, 5)))
        );

        System.out.println(students);
        System.out.println(studentsGroup);
    }
}
