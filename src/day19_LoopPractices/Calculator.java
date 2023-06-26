package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        System.out.println("Enter Math Operator:");
        char operator = scan.next().charAt(0);

        if (!(operator == '+' || operator == '-')) {
            System.err.println("Invalid Math Operator:" + operator);

            System.exit(0);
        }

        System.out.println("Enter a number");
        int num2 = scan.nextInt();

        if (operator == '-') {
            System.out.println(num1 - num2);
        } else {
            System.out.println(num1 + num2);
        }

    }
}
