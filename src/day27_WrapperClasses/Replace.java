package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        int[] arr2 = replace(array, 2, 90);
        System.out.println(Arrays.toString(arr2));


        String[] arr3 = {"Osman", "Mert"};

        String[] newArr = replace(arr3, 1, "Burcu");

        System.out.println(Arrays.toString(newArr));


    }

    public static int[] replace(int[] arr1, int index, int newElement) {

        if (index <= 0 || index >= arr1.length - 1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }

        arr1[index] = newElement;
        return arr1;
    }

    public static double[] replace(double[] arr1, int index, double newElement) {

        if (index <= 0 || index >= arr1.length - 1) {
            System.err.print("Invalid Index" + index);
            System.exit(0);
        }

        arr1[index] = newElement;
        return arr1;
    }

    public static char[] replace(char[] arr1, int index, char newElement) {

        if (index <= 0 || index >= arr1.length - 1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }

        arr1[index] = newElement;
        return arr1;
    }
    public static String[] replace(String[] arr1, int index, String newElement) {

        if (index <= 0 || index >arr1.length - 1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }

        arr1[index] = newElement;
        return arr1;
    }

}