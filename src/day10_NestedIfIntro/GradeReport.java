package day10_NestedIfIntro;

public class GradeReport {

    public static void main(String[] args) {
        int score = 59;

        if (score >= 0 && score <= 100) {
            if (score >= 90 && score <= 100) {
                System.out.println("Excellent");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Great");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Good");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Passed");
            } else if (score >= 0 && score <= 59) {
                System.out.println("Failed");
            }
        } else System.out.println("Invalid Score");


        System.out.println("***********************");

        String result = "";

        if (score >= 0 && score <= 100) {
            if (score >= 90 && score <= 100) {
                result = "Excellent";
            } else if (score >= 80 && score <= 89) {
                result = "Great";
            } else if (score >= 70 && score <= 79) {
                result = "Good";
            } else if (score >= 60 && score <= 69) {
                result = "Passed";
            } else if (score >= 0 && score <= 59) {
                result = "Failed";
            }
        } else result = "Invalid Score";
        System.out.println("result = " + result);

        String result3=(score >= 0 && score <= 100)? (score >= 90 && score <= 100)?"Excellent":(score >= 80 && score <= 89)?"Great":(score >= 70 && score <= 79)?"Good":(score >= 60 && score <= 69)?"Passed":"Failed":"Invalid Score";

    }


}
