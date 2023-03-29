package round_2.lesson6;

import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void studyOver() {
        marks = Collections.unmodifiableList(marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
