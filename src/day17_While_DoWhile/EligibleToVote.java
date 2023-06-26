package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = input.nextInt();

        while (!(age > 0 && age <= 120)) {

            System.err.println("Invalid entry, please re-enter");

            System.out.println("Enter Your Age: ");
            age = input.nextInt();

        }

        System.out.println("Are you US Citizen? yes/no");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Are you US Citizen? yes/no");
            answer = input.next().toLowerCase();
        }

        if (age >= 18 && answer.equals("yes")) {
            System.out.println("Eligible to Vote");
        } else
            System.out.println("Not Eligible to Vote");
    }
}
