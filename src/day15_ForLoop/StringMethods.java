package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("-----------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        System.out.println(hasCSharp);

        System.out.println("----------------------");

        String a = "Wooden Spoon";
        boolean b = a.startsWith("Woo");
        System.out.println("b = " + b);

        boolean c = a.endsWith("oon");
        System.out.println("c = " + c);

    }
}
