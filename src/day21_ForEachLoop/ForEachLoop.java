package day21_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {3, 6, 7};

        String[] names = {"Osman", "Burcu", "Halil"};

        for (String each : names) {
            System.out.println(each);
        }

        for (int each : numbers) {
            System.out.print(each);
        }
    }
}
