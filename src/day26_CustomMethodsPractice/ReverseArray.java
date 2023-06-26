package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int[] newArray = utilities.ArraysUtility.reversedArray(array);

        System.out.println(Arrays.toString(newArray));
    }
}
