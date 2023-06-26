package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinAvarage {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 30, 20, 40));

        int minNumber = list.get(0);
        int maxNumber = list.get(0);
        int sum = 0;
        int average = 0;

        int i = 0;

        for (Integer each : list) {
            sum += each;

            if (each > maxNumber) {
                maxNumber = each;
            }
            if (each< minNumber){
                minNumber=each;
            }
        }

        average += sum / list.size();

        System.out.println("average = " + average);
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);

    }
}
