package day01_JavaIntro;

import utilities.StringUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String str1 = "rakı";
        String str2 = "ırak";

        char[] array1 = new char[str1.length()];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = str1.charAt(i);
        }

        char[] array2 = new char[str2.length()];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = str2.charAt(i);
        }


        Arrays.sort(array1);
        Arrays.sort(array2);


        if (Arrays.equals(array1, array2)) {
            System.out.println("Str1 ve Str2 Anagramdır");
        } else
            System.out.println("Anagram Değildir");


    }
}
