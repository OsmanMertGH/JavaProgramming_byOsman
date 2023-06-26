package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, 2, 3, 2, 3, 4, 5));

        for (Integer each : list) {
            int frequency = 0;
            for (Integer element : list) {
                if (element == each) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(each);
                break;
            }
        }

    }
}
