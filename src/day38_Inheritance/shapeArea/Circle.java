package day38_Inheritance.shapeArea;

public class Circle extends Shape {

    double r;
    public static double PI=Math.PI;

    public Circle(String name,double r) {
        super(name);
        this.r = r;

    }

    public double area() {
        if (!(name.equals("Circle") || name.equals("Square") || name.equals("Rectangle"))) {
            return 0;
        }
        return PI * r * r;
    }

    public double perimeter() {
        if (!(name.equals("Circle") || name.equals("Square") || name.equals("Rectangle"))) {
            return 0;
        }
        return 2 * PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", name='" + name + '\'' +
                "r=" + r +
                ", PI=" + PI +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
