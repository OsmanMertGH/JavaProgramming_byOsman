package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Full Name:");
        String fullName = scan.nextLine();

        System.out.println("Enter Your Building Number");
        String buildingNumber = scan.next();

        scan.nextLine();

        System.out.println("Enter Your Street Name");
        String streetName = scan.nextLine();

        System.out.println("Enter Your City Name");
        String cityName = scan.nextLine();



        System.out.println("Enter Your State");
        String state = scan.next();


        System.out.println("Enter Your Zip Code");
        String zipCode = scan.next();

        scan.close();

    }
}
