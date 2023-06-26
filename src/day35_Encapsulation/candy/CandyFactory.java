package day35_Encapsulation.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> CandyList = new ArrayList<>();
        Candy candy1 = new Candy("Ulker", 200, 0, true);
        Candy candy2 = new Candy("JJ", 11, 24, true);
        Candy candy3 = new Candy("peet", 340, 20, false);
        Candy candy4 = new Candy("Gasgr", 580, 0, true);
        CandyList.addAll(Arrays.asList(candy1, candy2, candy3, candy4));

        System.out.println(CandyList);

        for (Candy each : CandyList) {
            System.out.println(each.getBrand() + " : " + each.getPrice());
        }
    }
}
