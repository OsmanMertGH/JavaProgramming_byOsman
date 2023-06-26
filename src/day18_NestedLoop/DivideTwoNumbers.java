package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int n1 = 30;
        int n2 = 4;

        int count = 0;

        while (n1 >= n2) {
            n1 -= n2;
            count++;
        }

        System.out.println(count);

    }
}
