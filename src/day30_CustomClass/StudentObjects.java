package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Osman", 'M', 29, 'A');

        Student[] students = {student1};

        ArrayList<String> earlyBirds = new ArrayList<>();

        for (Student each : students) {
            System.out.println(each);
        }

    }
}
