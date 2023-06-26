package day51_Map;

import java.util.*;

public class FrequencyOfCharWithMap {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";


        String[] arr = str.split("");

        Map<String, Integer> strChar = new LinkedHashMap<>();

        for (String each : arr) {
            strChar.put(each, Collections.frequency(Arrays.asList(arr), each));
        }

        System.out.println(strChar);
    }
}
