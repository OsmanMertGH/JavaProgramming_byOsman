package day38_Inheritance.shapeArea;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle("Circle", 4);

        System.out.println("Circle Area: "+circle1.area());
        System.out.println("Circle Perimeter: "+circle1.perimeter());


        System.out.println("-----------------------------");
        Square square1=new Square("Square",5);

        System.out.println("Square Area: "+square1.area());
        System.out.println("Square Perimeter: "+square1.perimeter());
    }
}
