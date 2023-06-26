package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloCydeo5Times();
        helloWorld5Times();

        evenNumbers();
    }

    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    public static void evenNumbers() {
        for (int i = 2; i < 11; i += 2) {
            System.out.print(i+ " ");
        }
    }


}

