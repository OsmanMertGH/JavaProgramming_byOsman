package day18_NestedLoop;

import java.util.Scanner;

public class OddEvenNumberLoops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Number: ");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is Even Number");
            } else {
                System.out.println(number + " is Odd Number");
            }


            System.out.println("Would u like to enter another number");
            String a = scan.next();


            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid,re - enter Yes or No");
                a = scan.next();
            }


            if (a.equals("no")) {
                break;
            }


        }

    }
}
