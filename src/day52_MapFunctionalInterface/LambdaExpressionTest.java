package day52_MapFunctionalInterface;

public class LambdaExpressionTest {

    public static void main(String[] args) {

        MyFirstFunctioanalInterface oddorEven = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even.");
            } else
                System.out.println(n + " is odd");
        };

        oddorEven.apply(5);

        MyFirstFunctioanalInterface eligibleToBuyAlcohol = n -> {
            if (n > 18) {
                System.out.println("Eligible");
            } else
                System.out.println("Not Eligible");
        };

        eligibleToBuyAlcohol.apply(25);
    }
}
