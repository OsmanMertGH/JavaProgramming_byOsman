package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int loginAttempt = 4;

        System.out.print("Enter Username: ");
        String username = input.next();

        System.out.print("Enter Password: ");
        String password = input.next();


        while ((!(username.equals("Cydeo") && password.equals("Cydeo123")) && !(loginAttempt == 1))) {

            loginAttempt--;
            System.out.println("Email or Password Incorrect. Last : " + loginAttempt + " Please re-enter");


            System.out.print("Enter Username Again: ");
            username = input.next();


            System.out.print("Enter Password Again: ");
            password = input.next();

        }

        if (loginAttempt == 1) {
            System.err.println("Your Account is Locked");
        }

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {

            System.out.println("Login Correctly");
        }


    }
}
