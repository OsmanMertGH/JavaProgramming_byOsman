package day13_String;

public class StringIntro {
    public static void main(String[] args) {

        String str1="Cat";
        String str2="Cat";

        System.out.println(str1==str2);

        System.out.println("*********************");

        String str3=new String("Cat");
        String str4=new String("Cat");

        System.out.println(str3.equals(str4));
    }
}
