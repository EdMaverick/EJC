package ex7.com.company.professions;

import ex2.Person;

public class Driver extends Person {

    private String name;
    private String surname;
    private String fathersName;
    private int drivingExperience;

    public Driver(String name, int drivingExperience) {
        this.name = name;
        this.drivingExperience = drivingExperience;
    }

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
}