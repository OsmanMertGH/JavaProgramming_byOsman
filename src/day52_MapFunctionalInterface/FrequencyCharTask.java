package day52_MapFunctionalInterface;

import java.util.*;

public class FrequencyCharTask {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> strMap = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);

            if (frequency == 1) {
                strMap.put(each, 1);
            }
        }

        System.out.println("strMap = " + strMap);


    }


}

/*
1. Write a program that can find the unique characters from a String

			Ex:
					str = "aabcccdeeeef";

			output:
					{b=1, d=1, f=1}
 */