package day15_ForLoop;

import java.util.Scanner;

public class MinumumNumber {
    public static void main(String[] args) {

        int min = 2140054666;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Number: ");
            int num = input.nextInt();

            if (num < min) {
                min = num;

            }
        }
        System.out.println("min = " + min);
    }
}
