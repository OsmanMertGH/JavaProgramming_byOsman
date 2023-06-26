package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!+^%&WoodenSpoon";

        String digitsNumber = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);


            if (ch > 47 && ch < 58) {
                digitsNumber += str.charAt(i);
            } else if ((ch > 64 && ch < 91) || (ch > 96 && ch < 123)) {
                letters += str.charAt(i);
            } else {
                specialChars += str.charAt(i);
            }


        }
        System.out.println("digitsNumber = " + digitsNumber);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

        //12345
        //CydeoWoodenSpoon
        //!+^%&
    }
}
