package day09_PassOfFailed;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 14,
                b = 13,
                c = 22;

        if (a > b && a < c || a > c && a < b) {

            System.out.println("a is median number = " + a);

        }

        if ((b>a && b<c || b>c && b<c)){

            System.out.println("b is median number = " + b);
        }

        if ((c>a && c<b || c>b && c<a)){

            System.out.println("c is median number = " + c);
        }
    }
}
