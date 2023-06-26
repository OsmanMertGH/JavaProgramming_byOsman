package day52_MapFunctionalInterface;

public class LambdaExpression2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach = a -> {
            for (String each : a.split("")) {
                System.out.println(each);
            }
        };

        printEach.apply("Osman&Burcu");

        MySecondFunctionalInterface<Integer> cube = c -> {
            System.out.println(c * c * c);
        };

        cube.apply(5);



    }


}
