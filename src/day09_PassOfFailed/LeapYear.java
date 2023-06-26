package day09_PassOfFailed;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2023;

        boolean leapYear = year%4 == 0;


        if (leapYear){

            System.out.println("Year "+year+" is leapYear");
        }
        else
            System.out.println("Year "+year + " is not leap year");

    }
}
