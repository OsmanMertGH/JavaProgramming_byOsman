package day15_ForLoop;

public class LoopsAlphabet {
    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++) {

            char alphabet = (char) i;

            System.out.print(alphabet + " ");

        }

        System.out.println();

        System.out.println("---------------------------");

        for (int i = 97; i <= 122; i++) {

            char alphabetSmall = (char) i;

            System.out.print(alphabetSmall + " ");
        }

        System.out.println();

        System.out.println("---------------------------");

        for (int i = 90; i >= 65; i--) {

            char alphabet = (char) i;

            System.out.print(alphabet + " ");

        }

        System.out.println();

        System.out.println("---------------------------");

        for (int i = 122; i >= 97; i--) {

            char alphabetSmall = (char) i;

            System.out.print(alphabetSmall + " ");
        }

    }
}
