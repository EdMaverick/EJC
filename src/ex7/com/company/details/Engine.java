package ex7.com.company.details;

public class Engine {

    private String producer;
    private int power;

    public Engine(String producer, int power) {
        this.producer = producer;
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public int getPower() {
        return power;
    }
}
