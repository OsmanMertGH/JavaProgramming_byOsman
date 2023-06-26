package day15_ForLoop;

import java.util.Scanner;

public class NameWriteRegular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();

        firstName = firstName.replaceFirst("c", "C");
        lastName = lastName.replaceFirst("s", "S");


        System.out.println(firstName + " " + lastName);


    }
}
