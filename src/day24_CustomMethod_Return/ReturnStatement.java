package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfDay(7);
    }

    public static void nameOfDay(int number) {

        if (number < 1 || number > 7) {
            return;
        }

        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wed");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Fri");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }
}
