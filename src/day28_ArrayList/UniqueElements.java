package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Rubby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);
        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)) {
                unique.add(each);
            }
        }
        System.out.println(unique);


        System.out.println("-------------------");
        boolean r2 = list.contains("Java");
        System.out.println(r2);
    }
}
