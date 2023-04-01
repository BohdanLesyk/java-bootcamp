package round_2.lesson10;

import java.util.Comparator;

public class Fest implements Comparable<Fest> {
    private String name;
    private String city;
    private YearMonth yearMonth;

    public Fest(String name, String city, YearMonth yearMonth) {
        this.name = name;
        this.city = city;
        this.yearMonth = yearMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public YearMonth getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(YearMonth yearMonth) {
        this.yearMonth = yearMonth;
    }

    @Override
    public int compareTo(Fest fest) {
        return this.getName().compareTo(fest.getName());
    }

    @Override
    public String toString() {
        return "Fest{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", yearMonth=" + yearMonth +
                '}';
    }

    public static class ComparatorByCity implements Comparator<Fest> {
        @Override
        public int compare(Fest fest1, Fest fest2) {
            return fest1.getCity().compareTo(fest2.getCity());
        }
    }

    public static class ComparatorByMonth implements Comparator<Fest> {
        @Override
        public int compare(Fest fest1, Fest fest2) {
            return fest1.getYearMonth().compareTo(fest2.getYearMonth());
        }
    }
}
