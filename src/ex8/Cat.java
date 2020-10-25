package ex8;

public class Cat extends Animal {

    private boolean isClimbing;

    public Cat(String food, String location, boolean isClimbing) {
        super(food, location);
        this.isClimbing = isClimbing;
    }

    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }
}
