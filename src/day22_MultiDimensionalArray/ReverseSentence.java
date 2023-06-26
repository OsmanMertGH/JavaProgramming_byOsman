package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Today is a good day to learn Java";

        String [] words=str.split(" ");

        System.out.println(Arrays.toString(words));

        String reversedSentence="";

        for (int i = words.length-1; i >= 0; i--) {
            reversedSentence+=words[i]+" ";

        }

        System.out.println(reversedSentence);

    }
}
