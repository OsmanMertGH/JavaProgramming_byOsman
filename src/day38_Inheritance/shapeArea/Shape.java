package day38_Inheritance.shapeArea;

public class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area() {
        if (!(name.equals("Circle") || name.equals("Square") || name.equals("Rectangle"))) {
            return 0;
        }
        int r = 5;
        double result = Math.PI * r;
        return result;
    }

    public double perimeter() {
        if (!(name.equals("Circle") || name.equals("Square") || name.equals("Rectangle"))) {
            return 0;
        }
        int r = 5;
        double result = Math.PI * r;
        return result;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape:
	variable:
		name

	Add A constructor to set the filed

	Methods:
		area(){return 0}
		perimeter{return 0}
		toString(): name, area, perimeter


Circle
	r
	pi

	toString(): name, r, pi, area, perimeter

Square
	s

	toString(): name, s, area, perimeter

Rectangle
	l
	w

	toString(): name, l, w, area, perimeter

 */