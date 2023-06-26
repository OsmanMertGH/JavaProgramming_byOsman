package day27_WrapperClasses;

public class ReplaceAll {

    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;

            }
        }
        return array;
    }
}
