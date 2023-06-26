package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        String email = "JohnSmith@yahoo.com";
        System.out.println("email = " + email);

        String emailGmail = email.replace("yahoo", "gmail");
        System.out.println("emailGmail = " + emailGmail);

        String sentence = "Java Java Python Python C++ C++ Python Python Python Python Python Python";
        sentence = sentence.replace("Python", "");
        sentence = sentence.replace("   ", " ");
        sentence = sentence.trim();

        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog Dog";
        s = s.replaceFirst("Dog", "Cat");

        System.out.println("s = " + s);
    }
}
