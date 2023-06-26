package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Ali";
        myGroup[1] = "Burcu";

        //myGroup[]="Osman","Hulya","Selin","Mali","Suat";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));


        System.out.println("------------------------------");

        int number = 5;

        if (number < 1 || number > 7) {

            System.err.println("Invalid Number");
            System.exit(0);

        }

        System.out.println(days[number - 1]);


    }
}
