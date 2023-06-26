package day53_StreamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6));
        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);


        System.out.println("----------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());

        System.out.println(list2);


        System.out.println("-----------------------------");

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        nums2 = Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2));


        System.out.println("--------------------------------");


        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list3 = list3.stream().map(p -> p * 10).collect(Collectors.toList());

        System.out.println(list3);

        System.out.println("--------------------------------");


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        arr1 = Arrays.stream(arr1).map(p -> p * 10).toArray();

        System.out.println(Arrays.toString(arr1));

        System.out.println("--------------------------------");


        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> oddList = list4.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());

        System.out.println(oddList);


        System.out.println("-------------------------");

        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        days= (String[]) Arrays.stream(days).map(p->p.substring(0,3)).toArray();

        System.out.println(Arrays.toString(days));

    }
}
