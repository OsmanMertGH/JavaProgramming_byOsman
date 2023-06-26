package day53_StreamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.*;
import java.util.stream.Collectors;

public class TestListFunction {

    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(2, 7, 3, 9, 4, 6, 55);

        // 1.1 Create a function that can return the maximum number from a list of Integer
        ListFunction<Integer, Integer> minFNumber = p -> {
            int minNumber = Integer.MAX_VALUE;
            for (Integer each : list1) {
                if (minNumber > each)
                    minNumber = each;
            }
            return minNumber;
        };

        System.out.println(minFNumber.apply(list1));


        System.out.println("-------------------------------------");

        // 1.2 Create a function that can return the minimum number from a list of Integer
        ListFunction<Integer, Integer> maxFNumber = p -> {
            int maxNumber = Integer.MIN_VALUE;
            for (Integer each : list1) {
                if (maxNumber < each)
                    maxNumber = each;
            }
            return maxNumber;
        };

        System.out.println(maxFNumber.apply(list1));

        System.out.println("-------------------------------------");
        // 1.3 Create a function that can return the longest String from a List of String

        List<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "smmsmsgkaskga", "pineapple"));

        ListFunction<String, String> longString = p -> {
            int maxWordLength = 0;
            String maxWordLen = "";

            for (String each : list2) {
                if (each.length() > maxWordLength)
                    maxWordLength = each.length();
                maxWordLen = each;
            }
            return maxWordLen;
        };

        System.out.println(longString.apply(list2));

        System.out.println("-------------------------------------");

        ListFunction<String, String> longest = list -> list.stream().max(Comparator.comparing(String::length)).orElse(null);
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "pineapple");
        String longestString = longest.apply(strings);
        System.out.println("Longest String: " + longestString); // Output: Longest String: pineapple

        // 1.4 Create a function that can return the shortest String from a List of String
        ListFunction<String, String> shortest = list -> list.stream().min(Comparator.comparing(String::length)).orElse(null);
        String shortestString = shortest.apply(strings);
        System.out.println("Shortest String: " + shortestString); // Output: Shortest String: kiwi

        // 1.5 Create a function that can convert List of integer to int array
        ListFunction<Integer, int[]> intArrayConverter = list -> list.stream().mapToInt(Integer::intValue).toArray();
        int[] intArray = intArrayConverter.apply(list1);
        System.out.println("Int Array: " + Arrays.toString(intArray)); // Output: Int Array: [2, 7, 3, 9, 4, 6, 1]

        // 1.6 Create a function that can convert List of double to double array
        ListFunction<Double, double[]> doubleArrayConverter = list -> list.stream().mapToDouble(Double::doubleValue).toArray();
        List<Double> doubles = Arrays.asList(3.14, 2.718, 1.618, 0.577, 1.414);
        double[] doubleArray = doubleArrayConverter.apply(doubles);
        System.out.println("Double Array: " + Arrays.toString(doubleArray)); // Output: Double Array: [3.14, 2.718, 1.618, 0.577, 1.414]
    }
}
