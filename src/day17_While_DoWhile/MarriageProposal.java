package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Burcix, will you marry me? yes/no");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {

            System.err.println("Invalid answer, please re-enter:");
            answer = input.next().toLowerCase();

        }
        System.out.println((answer.equalsIgnoreCase("yes") ? "congrats" : "goodbye"));

    }
}
