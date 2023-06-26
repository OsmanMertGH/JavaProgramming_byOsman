package day15_ForLoop;

import java.util.Scanner;


public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2147483648;

        for (int i = 1; i < 6; i++) {

            System.out.print("Enter Number= ");
            int number = input.nextInt();

            if (number > max) {
                max = number;

            }


        }

        System.out.println("En Büyük Numara: " + max);

    }
}
