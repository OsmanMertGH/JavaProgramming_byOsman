package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=input.nextInt();

        System.out.println("Enter Your Gender");
        String gender=input.next();

        input.nextLine();

        System.out.println("Enter Your FullName");
        String fullName=input.nextLine();

        System.out.println("Enter Phone Number");
        long phoneNumber=input.nextLong();

        System.out.println("Enter ZipCode");
        int zipCode=input.nextInt();

        input.nextLine();

        System.out.println("Enter Your SchoolName");
        String schoolName=input.nextLine();

        System.out.println("Enter Your CityName ");
        String cityName=input.nextLine();

        System.out.println("Enter Your StateName");
        String stateName=input.nextLine();

        System.out.println("Enter Your BuildingNumber");
        int buildingNumber=input.nextInt();


    }



}
