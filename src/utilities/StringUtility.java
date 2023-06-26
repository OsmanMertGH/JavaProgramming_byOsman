package utilities;

import java.util.Arrays;

public class StringUtility {

    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");
        }
    }

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static boolean isPolindrom(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }


    public static boolean isAnagram(String str1, String str2) {
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }


    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }

        }
        return result;
    }

}
