package day20_Arrays;

public class ArrayPractices4 {
    public static void main(String[] args) {

        String[] item = {"Shoes", "Gloves"};

        double[] prices = {99.9, 95.6};

        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i] + " $" + prices[i]);
        }
    }
}
