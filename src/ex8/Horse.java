package ex8;

public class Horse extends Animal {

    private boolean isLeaping;

    public Horse(String food, String location, boolean isLeaping) {
        super(food, location);
        this.isLeaping = isLeaping;
    }

    @Override
    public void makeNoise() {
        System.out.println("neigh");
    }

    @Override
    public void eat() {
        System.out.println("horse is eating");
    }
}
