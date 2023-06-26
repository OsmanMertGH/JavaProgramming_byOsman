package day15_ForLoop;

public class SumOfNumbers {
    public static void main(String[] args) {
        double sumOfNumbers = 0;
        for (int i = 1; i <= 100; i++) {

            sumOfNumbers += i;

        }
        System.out.println(sumOfNumbers);
    }
}
