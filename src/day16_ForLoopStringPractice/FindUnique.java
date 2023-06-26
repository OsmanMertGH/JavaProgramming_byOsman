package day16_ForLoopStringPractice;

public class FindUnique {
    public static void main(String[] args) {

        String str = "AABCCD";

        int a = str.indexOf('B');
        int b = str.lastIndexOf('B');

        String result = (a == b) ? "B is Unique" : "A is not Unique";

        System.out.println("result = " + result);

    }
}
