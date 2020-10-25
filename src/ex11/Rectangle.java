package ex11;

public class Rectangle extends AbstractShape {

    private String point;
    private int length;
    private int height;

    public Rectangle(String point, int length, int height) {
        this.point = point;
        this.length = length;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Rectangle was drawn at the point " + point);
    }

    @Override
    public double perim() {
        return (length + height) * 2;
    }

    @Override
    public double area() {
        return length * height;
    }
}
