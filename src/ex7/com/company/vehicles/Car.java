package ex7.com.company.vehicles;

import ex7.com.company.details.Engine;
import ex7.com.company.professions.Driver;

public class Car {

    private String make;
    private String classType;
    private int weight;

    private Driver driver;
    private Engine engine;

    public Car(String make, Driver driver, Engine engine) {
        this.make = make;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        if (driver.getFullName() != null) {
            System.out.println("Driver: " + driver.getFullName() + ", " + driver.getAge()
            + ", " + driver.getDrivingExperience());
        } else {
            System.out.println("Driver: " + driver.getName() + ", " + driver.getDrivingExperience());
        }
        System.out.println("Engine: " + engine.getProducer() + ", " + engine.getPower() + " hp.");
    }
}
