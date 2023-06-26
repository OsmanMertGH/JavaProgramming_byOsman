package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        double availableBalance = 1000.50;

        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        availableBalance -=200;
        System.out.println("availableBalance = " + availableBalance);

        String str = "Mert";
        str += " Osman";

        System.out.println("str = " + str);

        int x = 100;

        System.out.println("x = " + x);

        x += 200;

        System.out.println("x = " + x);

        short f=(short) 48522;

        System.out.println("f = " + f);


    }
}
