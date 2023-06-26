package day35_Encapsulation.encupsulation;

public class Circle {

    public static double pi;
    private static double radius;

    static {
        pi = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            return;
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "pi=" + pi +
                '}';
    }

    public static double calcArea() {
        double circleArea = pi * radius * radius;

        return circleArea;
    }
}
