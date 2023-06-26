package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String str = "JavaJavaJava";

        String cha = "Java";

        int frequency = 0;


        for (int i = 0; i < str.length()-3; i++) {

            String ch = str.substring(i, i+4);

            if (ch.equalsIgnoreCase(cha)) {
                frequency++;

            }

        }

        System.out.println("frequency = " + frequency);
    }
}
