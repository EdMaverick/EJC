package ex8;

public class Dog extends Animal {

    private boolean isDigging;

    public Dog(String food, String location, boolean isDigging) {
        super(food, location);
        this.isDigging = isDigging;
    }

    @Override
    public void makeNoise() {
        System.out.println("woof");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }
}
