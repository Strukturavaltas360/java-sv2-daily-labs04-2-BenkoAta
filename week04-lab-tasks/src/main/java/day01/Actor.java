package day01;

public class Actor {
    private String name;
    private int yearOfBirth;

    public Actor(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int ageInYear(int year) {
        return year - yearOfBirth + 1;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
