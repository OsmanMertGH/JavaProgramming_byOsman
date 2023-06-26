package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog";

        String cha = "Cat";

        int frequency = 0;


        for (int i = 0; i < str.length() - 3; i++) {

            String ch = str.substring(i, i + 3);

            if (ch.equalsIgnoreCase(cha)) {
                frequency++;

            }

        }

        System.out.println("frequency = " + frequency);


        System.out.println("--------------------");

        String s = "java java java java python python python";

        int countJava = 0;
        int countPython = 0;

        while (s.toLowerCase().contains("java")) {
            countJava++;
        }

        while (s.toLowerCase().contains("Python")) {
            countPython++;
        }

        System.out.println(countJava);

        System.out.println(countPython);
    }
}

