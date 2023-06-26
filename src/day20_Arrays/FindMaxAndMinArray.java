package day20_Arrays;

import java.util.Scanner;

public class FindMaxAndMinArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number :");
            numbers[i] = inp.nextInt();
        }

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int i = 0; i < 5; i++) {

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }

            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);
    }
}