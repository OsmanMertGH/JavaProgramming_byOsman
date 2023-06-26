package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        checkNumberOddOrEven(5);


        numbersBetween(10, 50);
    }

    public static void checkNumberOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + "even number.");
        } else
            System.out.println(number + " odd number.");
    }

    public static void numbersBetween(int x, int y) {
        x++;
        while (x < y) {
            System.out.print(x++ + " ");
        }
    }
}
