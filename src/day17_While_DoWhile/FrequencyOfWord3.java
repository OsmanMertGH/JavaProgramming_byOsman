package day17_While_DoWhile;

public class FrequencyOfWord3 {
    public static void main(String[] args) {

        String s = "java java java java python python python";

        int countJava = 0;
        int countPython = 0;

        while (s.contains("java")) {
            s=s.replace("java", "");
            countJava++;
        }

        while (s.toLowerCase().contains("python")) {
            s=s.replace("python", "");
            countPython++;
        }

        System.out.println(countJava);

        System.out.println(countPython);
    }
}
