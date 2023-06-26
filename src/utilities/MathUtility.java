package utilities;

public class MathUtility {

    //2.1 Create a method that can return the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    //2.2 Create a method that can return the sum of two decimal numbers
    public static double sum(double a, double b) {
        return a + b;
    }

    //2.3 Create a method that can return the subtraction of two integers
    public static int substraction(int a, int b) {
        return a - b;
    }

    //2.4 Create a method that can return the subtraction of two decimals
    public static double substraction(double a, double b) {
        return a - b;
    }

    //2.5 Creata a method that can return the multiplication of two integers
    public static int multiplication(int a, int b) {
        return a * b;
    }

    //2.6 Creata a method that can return the multiplication of two decimals
    public static double multiplication(double a, double b) {
        return a * b;
    }

    //2.7 Create a method that passes two double parameters and return the division reslt
    public static double divison(double a, double b) {
        return a / b;
    }

    //2.8 Create a method that can check if an integer is even number
    public static int isEven(int a) {
        if (a % 2 == 0) {
            System.out.println(a + "is even number");
        }
        return a;
    }

    //2.9 Create a method that can check if an integer is odd number
    public static int isOdd(int a) {
        if (a % 2 == 1) {
            System.out.println(a + "is even number");
        }
        return a;
    }

    //2.10 Create a method that can return the maximum number between two integers
    public static int maxNumber(int a, int b) {
        int maxNumber = b;
        if (a > b) {
            maxNumber = a;
        }
        return maxNumber;
    }

    //2.11 Create a method that can return the maximum number between two decimal numbers
    public static double maxNumber(double a, double b) {
        double maxNumber = b;
        if (a > b) {
            maxNumber = a;
        }
        return maxNumber;
    }

    //2.12 Create a method that can return the minimum number between two integers
    public static int minNumber(int a, int b) {
        int minNumber = b;
        if (a < b) {
            minNumber = a;
        }
        return minNumber;
    }


    //2.11 Create a method that can return the maximum number between two decimal numbers
    public static double minNumber(double a, double b) {
        double minNumber = b;
        if (a < b) {
            minNumber = a;
        }
        return minNumber;
    }

    //2.14 Create a method that can return the square of an integer
    //					Ex: square(2) ==> 4
    public static int square(int a){
        return a*a;
    }

    //2.15 Create a method that can return the square of a double
    public static double square(double b){
        return b*b;
    }

    //2.16 Create a method that can return the cube of an integer
    public static int cube(int a){
        return a*a*a;
    }

    //2.17 Create a method that can return the cube of a double
    public static double cube(double a){
        return a*a*a;
    }

}
