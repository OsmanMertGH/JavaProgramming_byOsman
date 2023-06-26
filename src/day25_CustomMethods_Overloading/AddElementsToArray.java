package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        arr=addInteger(arr, 5);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] addInteger(int[] array, int element) {

        int[] newArray = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            newArray[i++] = each;
        }

        newArray[i] = element;

        return newArray;
    }


}
