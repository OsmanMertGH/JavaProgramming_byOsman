package day04_Variables;

public class Circle {

    public static void main(String [] args){
        double PI = 3.14;
        double radius=3.5;
        double diameter = radius * 2;
        double area= radius*radius*PI;
        double perimeter = diameter * 2;

        System.out.println("radius = " + radius);
        System.out.println("PI = " + PI);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);



    }
}
