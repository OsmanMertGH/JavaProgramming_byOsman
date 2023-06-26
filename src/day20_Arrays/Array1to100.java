package day20_Arrays;

import java.util.Arrays;

public class Array1to100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0, j = 1; j <= 100; i++, j++) {
            numbers[i] = j;
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------");

        for (int i = 0, j = 100; j >= 1; i++, j--) {
            numbers[i] = j;
        }

        System.out.println(Arrays.toString(numbers));


    }

}
