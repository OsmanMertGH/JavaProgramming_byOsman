package day11_Switch_Scanner;

public class NumberTwoWordSwitch {

    public static void main(String[] args) {
        int number = 6;

        switch (number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Six");
        }
    }
}
