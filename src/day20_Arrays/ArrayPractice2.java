package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];

        letters[0] = 'A';
        letters[1] = 'B';


        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;

        }

        System.out.println(Arrays.toString(letters));


        System.out.println("----------------------------");

        int[] letters2 = new int[26];
        char reversCh = 'Z';

        for (int i = letters2.length - 1; i >= 0; i--) {
            letters2[i] = reversCh--;

        }

        char ch = 'Z';
        for (int i = 0; i < letters2.length ; i++, ch--) {

            letters2[i] = ch;
        }
        System.out.println(Arrays.toString(letters2));
    }
}
