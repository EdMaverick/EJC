package ex7.com.company.vehicles;

import ex7.com.company.details.Engine;
import ex7.com.company.professions.Driver;

public class SportCar extends Car {

    private int maxSpeed;

    public SportCar(String make, Driver driver, Engine engine, int maxSpeed) {
        super(make, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo() {
        // как добавить maxSpeed в "sout Engine" ?
    }
}
