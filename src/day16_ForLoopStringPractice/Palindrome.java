package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = input.nextLine();

        String result = "";


        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i);

        }
        System.out.println("Reverse Word : " + result);
        String isPalindrome = (result.equalsIgnoreCase(str)) ? "This Word is Palindrome" : "This word not palindrome";

        System.out.println(isPalindrome);
    }
}
