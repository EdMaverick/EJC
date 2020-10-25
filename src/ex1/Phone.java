package ex1;

public class Phone {

    // a) л)
    private int number;
    private String model;
    private double weight;

    // ж)
    public Phone() {
    }

    // е)
    public Phone(final int number, final String model) {
        this.number = number;
        this.model = model;
    }

    // д) з)
    public Phone(final int number, final String model, final double weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return this.number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    // г)
    public void receiveCall(String name) {
        System.out.println("Звонит " + name + ".\n");
    }

    // и)
    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + ", номер " + number + ".\n");
    }

    // к)
    public void sendMessage(int... number) {
        for (int value : number) {
            System.out.println(value);
        }
    }
}