package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++) {

            System.out.println(i);

        }

        for (int i = 100; i >= 50; i--) {
            System.out.println("i = " + i);
        }


        //print even numbers between 1-55

        System.out.println("--------------------------");

        for (int i = 1; i <= 55; i++) {

            if (i % 2 == 0) {
                System.out.println("Even Number= " + i);
            }


        }


    }
}
