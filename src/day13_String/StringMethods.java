package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);


        System.out.println("-------------------");

        String s1 = "Batch 25 is the best batch";

        int characterLength = s1.length();

        System.out.println("characterLength = " + characterLength);

        char lastChar = s1.charAt(s1.length() - 1);

        System.out.println("lastChar = " + lastChar);

        String name = "wooden spoon";
        name = name.toUpperCase();

        System.out.println("name = " + name);


    }
}
