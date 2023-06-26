package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "UK";

        System.out.println(name + "is eligible to vote : " + isEligible);

        System.out.println("--------------------------------------");

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 23;
        int income = 4000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 6000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("--------------------------------");

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name3 + " is eligible to register " + isEligible3);

        System.out.println("---------------------------");

        boolean result2 = true;

        System.out.println("result2=" + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }
}
