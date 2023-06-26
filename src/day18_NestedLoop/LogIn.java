package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Username:");
        String u = scan.next();

        System.out.println("Enter Your Password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {

            System.out.println("Logged In");

        } else {
            for (int i = 0; i < 3; i++) {

                System.out.println("Incorrect username or password, please re-enter");

                System.out.println("Enter Your Username:");
                u = scan.next();

                System.out.println("Enter Your Password:");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged In");
                    break;
                }

            }


            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.err.println("Account Locked");
            }


        }
    }
}
