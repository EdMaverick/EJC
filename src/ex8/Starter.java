package ex8;

public class Starter {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("cat food", "cat location", true),
                new Dog("dog food", "dog location", false),
                new Horse("horse food", "horse location", true)};

        Veterinarian veterinarian = new Veterinarian();

        for (Animal a : animals) {
            a.makeNoise();
            veterinarian.treatAnimal(a);
        }
    }
}
