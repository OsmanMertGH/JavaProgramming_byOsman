package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, <, >=, <=

        boolean result1 = 20 > 40;

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);


        boolean result11 = "Java101" != "Java102";
        System.out.println("result11 = " + result11);

    }
}
