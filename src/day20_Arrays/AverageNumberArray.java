package day20_Arrays;

import java.util.Scanner;

public class AverageNumberArray {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("How many numbers do u want to enter:");
        int numbersLength = inp.nextInt();

        int[] numbers = new int[numbersLength];

        for (int i = 0; i < numbersLength; i++) {
            System.out.println("Enter a number:");
            numbers[i] = inp.nextInt();
        }
        int total = 0;
        int average = 0;

        for (int i = 0; i < numbersLength; i++) {
            total += numbers[i];
        }

        average = total / numbersLength;

        System.out.println("total = " + total);
        System.out.println("average = " + average);

    }
}
