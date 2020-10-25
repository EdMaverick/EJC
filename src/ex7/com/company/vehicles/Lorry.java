package ex7.com.company.vehicles;

import ex7.com.company.details.Engine;
import ex7.com.company.professions.Driver;

public class Lorry extends Car {

    private int liftingCapacity;

    public Lorry(String make, Driver driver, Engine engine, int liftingCapacity) {
        super(make, driver, engine);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Lifting Capacity: " + this.liftingCapacity);
    }
}
