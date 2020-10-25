package ex7;

import ex7.com.company.details.Engine;
import ex7.com.company.professions.Driver;
import ex7.com.company.vehicles.Car;
import ex7.com.company.vehicles.Lorry;

public class Starter {

    public static void main(String[] args) {
        Driver fromDriver = new Driver("driver", 1);
        Driver fromPerson = new Driver("person", 25, 2);
        Engine N47 = new Engine("ScheiseINC", 177);
        Car BMW = new Car("BMW", fromDriver, N47);
        Car chermet = new Lorry("Toyota", fromPerson, N47, 100);

        BMW.printInfo();
        chermet.start();
        chermet.printInfo();
    }
}
