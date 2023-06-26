package day25_CustomMethods_Overloading;

public class SumOfnumbers {

    public static void main(String[] args) {
        int sum = sumOf2Numbers(5, 9);

        int sum2 = sumOf3Numbers(5, 9, 6);

        int sum3 = sumOf4Numbers(8, 5, 4, 7);

        System.out.println("sum = " + sum);

        System.out.println("sum2 = " + sum2);

        System.out.println("sum3 = " + sum3);

    }

    public static int sumOf2Numbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int sumOf3Numbers(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d) {

        return a + b + c + d;
    }
}
