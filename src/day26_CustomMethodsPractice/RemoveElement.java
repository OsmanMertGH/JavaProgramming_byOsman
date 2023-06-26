package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40};

        int[] newArray = ArraysUtility.removeElement(array, 2);

        System.out.println(Arrays.toString(newArray));


    }
}
