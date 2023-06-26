package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("Enter You Age: ");
            int age = scan.nextInt();

            while (!(age > 0 && age < 121)) {
                System.out.println("Invalid Entery, Please re-enter your age:");
                age = scan.nextInt();

            }

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {

                System.out.println("Invalid Entery Please re-enter");

                a = scan.next().toLowerCase();

            }

            if (a.equals("no")) {
                break;
            }
        }
    }


}
