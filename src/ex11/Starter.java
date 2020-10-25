package ex11;

public class Starter {

    public static void main(String[] args) {
        AbstractShape[] shapes = new AbstractShape[]{
                new Circle("A3", 6),
                new Rectangle("B6", 10, 5)};
        for (AbstractShape s : shapes) {
            s.draw();
            System.out.println("Perimeter: " + s.perim());
            System.out.println("Area: " + s.area());
        }
    }
}
