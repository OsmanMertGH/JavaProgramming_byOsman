package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each element of int Array. --input: int[] Array --output:println
    public static void printEachElementOfArray(int[] arrayArg) {
        for (int each : arrayArg) {
            System.out.println(each);
        }
    }

    //prints each element of double Array. --input: double[] Array --output:println
    public static void printEachElementOfArray(double[] arrayArg) {
        for (double each : arrayArg) {
            System.out.println(each);
        }
    }

    //prints each element of char Array. --input: char[] Array --output:println
    public static void printEachElementOfArray(char[] arrayArg) {
        for (char each : arrayArg) {
            System.out.println(each);
        }
    }

    //prints each element of String Array. --input: String[] Array --output:println
    public static void printEachElementOfArray(String[] arrayArg) {
        for (String each : arrayArg) {
            System.out.println(each);
        }
    }

    //returns max number of Integer Array. --input: int[] Array --output:int
    public static int maxNumberOfArray(int[] arrayArg) {
        Arrays.sort(arrayArg);
        int maxNumber = arrayArg[arrayArg.length - 1];
        return maxNumber;
    }

    //returns max number of Double Array. --input: double[] Array --output:double
    public static double maxNumberOfArray(double[] arrayArg) {
        Arrays.sort(arrayArg);
        double maxNumber = arrayArg[arrayArg.length - 1];
        return maxNumber;
    }

    //returns max number of int Array. --input: int[] Array --output:int
    public static int minNumberOfArray(int[] arrayArg) {
        Arrays.sort(arrayArg);
        int minNumber = arrayArg[0];
        return minNumber;
    }

    //returns max number of double Array. --input: double[] Array --output:double
    public static double minNumberOfArray(double[] arrayArg) {
        Arrays.sort(arrayArg);
        double minNumber = arrayArg[0];
        return minNumber;
    }

    //returns whether the given int array contains given int number or not. --input:int[] array, int number --output=true
    public static boolean arrayContainsNumber(int[] arrayArg, int number) {
        boolean result = false;
        for (int each : arrayArg) {
            if (each == number)
                result = true;
        }
        return result;
    }

    //returns whether the given double array contains given double number or not. --input:double[] array, double number --output=true
    public static boolean arrayContainsNumber(double[] arrayArg, double number) {
        boolean result = false;
        for (double each : arrayArg) {
            if (each == number)
                result = true;
        }
        return result;
    }

    //returns whether the given char array contains given char number or not. --input:char[] array, char number --output=true
    public static boolean arrayContainsNumber(char[] arrayArg, char number) {
        boolean result = false;
        for (char each : arrayArg) {
            if (each == number)
                result = true;
        }
        return result;
    }

    // merges given int two arrays. --input:int[] array, int[] array --output:int[] array
    public static int[] mergeArray(int[] array1Arg, int[] array2Arg) {
        int[] mergedArray = new int[array1Arg.length + array2Arg.length];
        for (int i = 0; i < array1Arg.length; i++) {
            mergedArray[i] = array1Arg[i];
        }
        int count = array1Arg.length;
        for (int i = 0; i < array2Arg.length; i++) {
            mergedArray[count] = array2Arg[i];
            count++;
        }
        return mergedArray;
    }

    // merges given double two arrays. --input:double[] array, double[] array --output:double[] array
    public static double[] mergeArray(double[] array1Arg, double[] array2Arg) {
        double[] mergedArray = new double[array1Arg.length + array2Arg.length];
        for (int i = 0; i < array1Arg.length; i++) {
            mergedArray[i] = array1Arg[i];
        }
        int count = array1Arg.length;
        for (int i = 0; i < array2Arg.length; i++) {
            mergedArray[count] = array2Arg[i];
            count++;
        }
        return mergedArray;
    }

    // merges given char two arrays. --input:char[] array, char[] array --output:char[] array
    public static char[] mergeArray(char[] array1Arg, char[] array2Arg) {
        char[] mergedArray = new char[array1Arg.length + array2Arg.length];
        for (int i = 0; i < array1Arg.length; i++) {
            mergedArray[i] = array1Arg[i];
        }
        int count = array1Arg.length;
        for (int i = 0; i < array2Arg.length; i++) {
            mergedArray[count] = array2Arg[i];
            count++;
        }
        return mergedArray;
    }

    // merges given String two arrays. --input:String[] array, String[] array --output:String[] array
    public static String[] mergeArray(String[] array1Arg, String[] array2Arg) {
        String[] mergedArray = new String[array1Arg.length + array2Arg.length];
        for (int i = 0; i < array1Arg.length; i++) {
            mergedArray[i] = array1Arg[i];
        }
        int count = array1Arg.length;
        for (int i = 0; i < array2Arg.length; i++) {
            mergedArray[count] = array2Arg[i];
            count++;
        }
        return mergedArray;
    }

    // reverses given int array. --input:int[] array --output:int[] array
    public static int[] reversedArray(int[] arrayArg) {
        int[] reversedArray = new int[arrayArg.length];
        int count = 0;

        for (int i = arrayArg.length; i >= 0; i--) {
            reversedArray[count] = arrayArg[i];
            count++;
        }
        return reversedArray;
    }

    // reverses given double array. --input:double[] array --output:double[] array
    public static double[] reversedArray(double[] arrayArg) {
        double[] reversedArray = new double[arrayArg.length];
        int count = 0;

        for (int i = arrayArg.length; i >= 0; i--) {
            reversedArray[count] = arrayArg[i];
            count++;
        }
        return reversedArray;
    }

    // reverses given char array. --input:char[] array --output:char[] array
    public static char[] reversedArray(char[] arrayArg) {
        char[] reversedArray = new char[arrayArg.length];
        int count = 0;

        for (int i = arrayArg.length; i >= 0; i--) {
            reversedArray[count] = arrayArg[i];
            count++;
        }
        return reversedArray;
    }

    // reverses given String array. --input:String[] array --output:String[] array
    public static String[] reversedArray(String[] arrayArg) {
        String[] reversedArray = new String[arrayArg.length];
        int count = 0;

        for (int i = arrayArg.length; i >= 0; i--) {
            reversedArray[count] = arrayArg[i];
            count++;
        }
        return reversedArray;
    }

    // adds an int to int[] array. --input: int[] array, int --output:int[] array
    public static int[] addsElement(int[] arrayArg, int elementArg) {
        int[] addedArray = new int[arrayArg.length + 1];
        int count = 0;
        for (int i = 0; i < arrayArg.length; i++) {
            addedArray[count++] = arrayArg[i];
        }
        addedArray[count] = elementArg;
        return addedArray;
    }

    // adds an double to double[] array. --input: double[] array, double --output:double[] array
    public static double[] addsElement(double[] arrayArg, double elementArg) {
        double[] addedArray = new double[arrayArg.length + 1];
        int count = 0;
        for (int i = 0; i < arrayArg.length; i++) {
            addedArray[count++] = arrayArg[i];
        }
        addedArray[count] = elementArg;
        return addedArray;
    }

    // adds an char to char[] array. --input: char[] array, char --output:char[] array
    public static char[] addsElement(char[] arrayArg, char elementArg) {
        char[] addedArray = new char[arrayArg.length + 1];
        int count = 0;
        for (int i = 0; i < arrayArg.length; i++) {
            addedArray[count++] = arrayArg[i];
        }
        addedArray[count] = elementArg;
        return addedArray;
    }

    // adds an String to String[] array. --input: String[] array, String --output:String[] array
    public static String[] addsElement(String[] arrayArg, String elementArg) {
        String[] addedArray = new String[arrayArg.length + 1];
        int count = 0;
        for (int i = 0; i < arrayArg.length; i++) {
            addedArray[count++] = arrayArg[i];
        }
        addedArray[count] = elementArg;
        return addedArray;
    }

    // returns frequency of given integer in the given array. input:int[] array, int --output:int
    public static int frequencyOfElement(int[] arrayArg, int element) {
        int count = 0;
        for (int each : arrayArg) {
            if (each == element)
                count++;
        }
        return count;
    }

    // returns frequency of given double in the given array. input:double[] array, double --output:int
    public static int frequencyOfElement(double[] arrayArg, double element) {
        int count = 0;
        for (double each : arrayArg) {
            if (each == element)
                count++;
        }
        return count;
    }

    // returns frequency of given char in the given array. input:char[] array, char --output:int
    public static int frequencyOfElement(char[] arrayArg, char element) {
        int count = 0;
        for (char each : arrayArg) {
            if (each == element)
                count++;
        }
        return count;
    }

    // returns frequency of given String in the given array. input:String[] array, String --output:int
    public static int frequencyOfElement(String[] arrayArg, String element) {
        int count = 0;
        for (String each : arrayArg) {
            if (each == element)
                count++;
        }
        return count;
    }

    //remove the elements according to index number from the array. --input: int[] array, int index --output:int[]array
    public static int[] removeElement(int[] arrayArg, int indexArg) {
        if (indexArg < 0 || indexArg > arrayArg.length) {
            System.exit(0);
        }
        int[] removedArray = {};
        for (int i = 0; i < arrayArg.length; i++) {
            if (!(i == indexArg)) {
                removedArray = ArraysUtility.addsElement(removedArray, arrayArg[i]);
            }
        }
        return removedArray;

    }

    //remove the elements according to index number from the array. --input: double[] array, int index --output:double[]array
    public static double[] removeElement(double[] arrayArg, int indexArg) {
        if (indexArg < 0 || indexArg > arrayArg.length) {
            System.exit(0);
        }
        double[] removedArray = {};
        for (int i = 0; i < arrayArg.length; i++) {
            if (!(i == indexArg)) {
                removedArray = ArraysUtility.addsElement(removedArray, arrayArg[i]);
            }
        }
        return removedArray;

    }

    //remove the elements according to index number from the array. --input: char[] array, int index --output:char[]array
    public static char[] removeElement(char[] arrayArg, int indexArg) {
        if (indexArg < 0 || indexArg > arrayArg.length) {
            System.exit(0);
        }
        char[] removedArray = {};
        for (int i = 0; i < arrayArg.length; i++) {
            if (!(i == indexArg)) {
                removedArray = ArraysUtility.addsElement(removedArray, arrayArg[i]);
            }
        }
        return removedArray;

    }

    //remove the elements according to index number from the array. --input: String[] array, int index --output:String[]array
    public static String[] removeElement(String[] arrayArg, int indexArg) {
        if (indexArg < 0 || indexArg > arrayArg.length) {
            System.exit(0);
        }
        String[] removedArray = {};
        for (int i = 0; i < arrayArg.length; i++) {
            if (!(i == indexArg)) {
                removedArray = ArraysUtility.addsElement(removedArray, arrayArg[i]);
            }
        }
        return removedArray;

    }

    // changes a new element with the given index number in int Array. --input:int[] array, int index, int element --output: int[] array
    public static int[] changesElement(int[] arrayArg, int indexArg, int elementArg) {
        if (indexArg < 0 || indexArg > arrayArg.length - 1)
            System.exit(0);
        int[] newArray = {};
        for (int i = 0; i < arrayArg.length; i++) {
            if (!(i == indexArg)) {
                newArray = addsElement(newArray, arrayArg[i]);
            } else {
                newArray = addsElement(newArray, elementArg);
            }
        }
        return newArray;
    }

    // changes a new element with the given index number in double Array. --input:double[] array, int index, double element --output: double[] array
    public static double[] changesElement(double[] arrayArg, int indexArg, double elementArg) {
        if (indexArg < 0 || indexArg > arrayArg.length - 1)
            System.exit(0);
        double[] newArray = {};
        for (int i = 0; i < arrayArg.length; i++) {
            if (!(i == indexArg)) {
                newArray = addsElement(newArray, arrayArg[i]);
            } else {
                newArray = addsElement(newArray, elementArg);
            }
        }
        return newArray;
    }

    // changes a new element with the given index number in char Array. --input:char[] array, int index, char element --output: char[] array
    public static char[] changesElement(char[] arrayArg, int indexArg, char elementArg) {
        if (indexArg < 0 || indexArg > arrayArg.length - 1)
            System.exit(0);
        char[] newArray = {};
        for (int i = 0; i < arrayArg.length; i++) {
            if (!(i == indexArg)) {
                newArray = addsElement(newArray, arrayArg[i]);
            } else {
                newArray = addsElement(newArray, elementArg);
            }
        }
        return newArray;
    }

    // changes a new element with the given index number in String Array. --input:String[] array, int index, String element --output: String[] array
    public static String[] changesElement(String[] arrayArg, int indexArg, String elementArg) {
        if (indexArg < 0 || indexArg > arrayArg.length - 1)
            System.exit(0);
        String[] newArray = {};
        for (int i = 0; i < arrayArg.length; i++) {
            if (!(i == indexArg)) {
                newArray = addsElement(newArray, arrayArg[i]);
            } else {
                newArray = addsElement(newArray, elementArg);
            }
        }
        return newArray;
    }
}