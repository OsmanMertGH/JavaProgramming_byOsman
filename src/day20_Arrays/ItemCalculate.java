package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ItemCalculate {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String[] items = new String[5];
        double[] prices = new double[5];

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter an item name:");
            items[i] = inp.nextLine();
        }

        double totalPrices = 0;

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter a prices name:");
            prices[i] = inp.nextDouble();
            totalPrices += prices[i];
        }

        System.out.println("ItemName -------- Price");

        System.out.println(items[0] + " -------- " + prices[0]);
        System.out.println(items[1] + " -------- " + prices[1]);
        System.out.println(items[2] + " -------- " + prices[2]);
        System.out.println(items[3] + " -------- " + prices[3]);
        System.out.println(items[4] + " -------- " + prices[4]);

        System.out.println("Total Price " + "--" + totalPrices);

    }
}
