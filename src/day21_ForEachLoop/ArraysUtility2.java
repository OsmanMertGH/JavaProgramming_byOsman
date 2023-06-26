package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {


    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "David", "James", "Aaron"};

        String[] earlyBirds = Arrays.copyOf(students, students.length);

        System.out.println(Arrays.toString(earlyBirds));



    }
}
