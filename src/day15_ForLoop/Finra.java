package day15_ForLoop;

public class Finra {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else System.out.print(i + " ");
        }
    }
}
