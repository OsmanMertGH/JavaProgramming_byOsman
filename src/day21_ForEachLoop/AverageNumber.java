package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 4, 20, 1};

        int sum = 0;

        for (int each : numbers) {
            sum += each;
        }

        sum = sum / numbers.length;
        System.out.println(sum);
    }
}
