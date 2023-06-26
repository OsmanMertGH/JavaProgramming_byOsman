package day16_ForLoopStringPractice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Osman Mert Denemek Lazım";

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            result += ch;


        }

        System.out.println(result);
    }
}
