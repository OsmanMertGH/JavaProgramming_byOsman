package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String str = "aaabbbcdeefgg";


        String removedStr = removeDuplicate(str);
        System.out.println(removedStr);
    }

    public static String removeDuplicate(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;
    }
}
