package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50,80,90,101};

        int[] reversed = new int[numbers.length];

        //50,40,30,20,10

        int i = numbers.length - 1;
        for (int each : numbers) {
            reversed[i] = each;
            i--;

        }

        System.out.println(Arrays.toString(reversed));

    }
}
