package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
        System.out.println(numbers);

        System.out.println("----------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);

        employees.remove(employees.size() - 1);

        System.out.println(employees);

        employees.remove("Neira");

        System.out.println(employees);
    }
}
