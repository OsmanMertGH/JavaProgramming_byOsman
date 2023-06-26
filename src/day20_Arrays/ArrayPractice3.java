package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would u like to enter?");

        int length = input.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        input.close();
    }
}
