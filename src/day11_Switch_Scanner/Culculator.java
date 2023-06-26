package day11_Switch_Scanner;

import java.util.Scanner;

public class Culculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n1, n2;
        System.out.print("First Number:");
        n1 = s.nextDouble();
        System.out.print("Second Number:");
        n2 = s.nextDouble();

        double result=3.0;

        char operator = '*';

        boolean operatorValid = operator == '+' || operator == '-' || operator == '/' || operator == '*';

        if (operatorValid) {

            switch (operator) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '/':
                    result = n1 / n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
            }
            System.out.println("Operatör: "+operator);
            System.out.println("result = " + result);
        }else {
            System.out.println("Invalid Character");
        }


    }
}
