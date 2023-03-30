package round_2.lesson7;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private final String name;
    private String region;
    private final int birthYear;
    private final boolean isMale;

    public Person(String name, String region, int birthYear, boolean isMale) {
        this.name = name;
        this.region = region;
        this.birthYear = birthYear;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", birthYear=" + birthYear +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        int result = this.getName().compareTo(person.getName());

        if (result == 0) {
            result = this.getRegion().compareTo(person.getRegion());

            if (result == 0) {
                result = this.getBirthYear() - person.getBirthYear();

                if (result == 0) {
                    result = Boolean.compare(this.isMale(), person.isMale());
                }
            }
        }

        return result;
    }

    static class ComparatorByRegionNameIsMaleBirthYear implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            int result = person1.getRegion().compareTo(person2.getRegion());

            if (result == 0) {
                result = person1.getName().compareTo(person2.getName());

                if (result == 0) {
                    result = Boolean.compare(person1.isMale(), person2.isMale());

                    if (result == 0) {
                        result = person1.getBirthYear() - person2.getBirthYear();
                    }
                }
            }

            return result;
        }
    }

    static class ComparatorByBirthYearIsMaleNameRegion implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            int result = person1.getBirthYear() - person2.getBirthYear();

            if (result == 0) {
                result = Boolean.compare(person1.isMale(), person2.isMale());

                if (result == 0) {
                    result = person1.getName().compareTo(person2.getName());

                    if (result == 0) {
                        result = person1.getRegion().compareTo(person2.getRegion());
                    }
                }
            }

            return result;
        }
    }

    static class ComparatorByIsMaleNameRegionBirthYear implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            int result = Boolean.compare(person1.isMale(), person2.isMale());

            if (result == 0) {
                result = person1.getName().compareTo(person2.getName());

                if (result == 0) {
                    result = person1.getRegion().compareTo(person2.getRegion());

                    if (result == 0) {
                        result = person1.getBirthYear() - person2.getBirthYear();
                    }
                }
            }

            return result;
        }
    }
}
