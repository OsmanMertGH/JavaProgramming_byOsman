package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static int frequencyOfElement(int[] array, int element) {

        int count = 0;

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

}
