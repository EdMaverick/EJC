package ex11;

public class Circle extends AbstractShape {

    private String point;
    private int radius;

    public Circle(String point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Circle was drawn at the point " + point);
    }

    @Override
    public double perim() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
