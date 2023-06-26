package day52_MapFunctionalInterface;

import java.util.*;

public class FrequencyCharTask2 {
    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();


        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            result.put(each,frequency);
        }

        String maxFreqChar="";
        int maxFrequency= result.get("e");

        for (Map.Entry<String, Integer> eachPair : result.entrySet()) {
            if (eachPair.getValue()>maxFrequency){
                maxFrequency=eachPair.getValue();
                maxFreqChar=eachPair.getKey();
            }
        }

        System.out.println("result = " + result);
        System.out.println("Character "+maxFreqChar+" has the highest frequency");
    }

}
