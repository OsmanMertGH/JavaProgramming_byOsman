package day10_NestedIfIntro;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even");
        } else
            System.out.println("Odd");

        System.out.println("***************************");

        String result = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println("----------------------------");

        int age = 23;

        String isEligible = (age >= 21) ? "Eligible to buy alcohol" : "Not eligible to buy Alcohol";

        System.out.println(isEligible);

        System.out.println("------------------------------------");

        int number = -15;

        String isNumber = (number > 100) ? ("Possitive") : (number < 0) ? ("Negative") : ("Zero");

        System.out.println("isNumber = " + isNumber);
    }

}
