package day35_Encapsulation.encupsulation;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(25.2);

        System.out.println(circle1);

        circle1.setRadius(27.2);

        System.out.println(circle1);

        System.out.println(Circle.calcArea());

        circle1.setRadius(-10);

        System.out.println(circle1);
    }
}
