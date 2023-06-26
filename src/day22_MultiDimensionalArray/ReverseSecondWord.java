package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String[] words = sentence.split(" ");

        String reversedWord = "";

        for (int i = words[1].length() - 1; i >= 0; i--) {

            reversedWord += words[1].charAt(i);

        }

        words[1] = reversedWord;

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            System.out.print(word+" ");
        }

    }
}
// I evoL Java