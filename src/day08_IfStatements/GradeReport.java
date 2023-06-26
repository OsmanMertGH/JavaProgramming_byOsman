package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score=45;

        if (score>=90){

            System.out.println("Excellent = " + score);

        }

        if (score>=80 && score<90){

            System.out.println("Great = " + score);
        }

        if (score>=70 && score<80){

            System.out.println("Good = " + score);
        }

        if (score>=60 && score<69){

            System.out.println("Passed = " + score);
        }
        if (score>=0 && score<60){

            System.out.println("Failed = " + score);
        }

    }
}
