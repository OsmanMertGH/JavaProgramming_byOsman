package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "     batch   25     ";
        System.out.println("str1 = " + str1);
       /* str1 = str1.trim();
        System.out.println("str1 = " + str1);
*/
        String str2 = "Cydeo School";

        int indexNumber = str2.indexOf("h");

        System.out.println("indexNumber = " + indexNumber);

        int indexLNumber = str2.lastIndexOf("l");

        System.out.println("indexLNumber = " + indexLNumber);
    }
}
