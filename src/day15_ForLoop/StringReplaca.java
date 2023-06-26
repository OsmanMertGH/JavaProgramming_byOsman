package day15_ForLoop;

import java.util.Scanner;

public class StringReplaca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Değer Giriniz:");
        String a = input.nextLine();

        if (a.charAt(0) == 'x') {

            a = a.replaceFirst("x", "a");

            System.out.println("a = " + a);

            a = a.replace("x", "a").replace("X", "a");


            System.out.println("a = " + a);
        }
    }
}
