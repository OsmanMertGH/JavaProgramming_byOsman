package day21_ForEachLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";

        for (char each : str.toCharArray()) {

            System.out.println(each);
        }

    }
}
