package day38_Inheritance.shapeArea;

public class Square extends Shape {
    double s;

    public Square(String name,double s) {
        super(name);
        this.s = s;
    }

    public double area() {
        if (!(name.equals("Circle") || name.equals("Square") || name.equals("Rectangle"))) {
            return 0;
        }
        return s * s;
    }

    public double perimeter() {
        if (!(name.equals("Circle") || name.equals("Square") || name.equals("Rectangle"))) {
            return 0;
        }
        return 4 * s;
    }




}