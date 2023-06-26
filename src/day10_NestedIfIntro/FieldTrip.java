package day10_NestedIfIntro;

public class FieldTrip {
    public static void main(String[] args) {

        int gradeNumber = 6;
        String groupName="", location="", teacherInCharge="";

        int numberOfGroup=1;

        if (gradeNumber > 0 && gradeNumber < 7) {
            if (gradeNumber == 1) {
                groupName = "Grade- 1";
                location = "Apple orchard";
                numberOfGroup = 3;
                teacherInCharge = "Ms.Smith";
            } else if (gradeNumber == 2) {
                groupName = "Grade- 2";
                location = "Zoo";
                numberOfGroup = 7;
                teacherInCharge = "Mr. Lee";
            } else if (gradeNumber == 3) {
                groupName = "Grade- 3";
                location = "Aquarium";
                numberOfGroup = 5;
                teacherInCharge = "Ms. Wilson";
            } else if (gradeNumber == 4) {
                groupName = "Grade- 4";
                location = "Movie theater";
                numberOfGroup = 2;
                teacherInCharge = "Ms. Reyes";
            } else if (gradeNumber == 5) {
                groupName = "Grade- 5";
                location = "Museum ";
                numberOfGroup = 5;
                teacherInCharge = "Ms. Lela";
            } else {
                groupName = "Grade- 6";
                location = "Six Flags ";
                numberOfGroup = 8;
                teacherInCharge = "Mr. Watt";
            }

            System.out.println("groupName = " + groupName);
            System.out.println("numberOfGroup = " + numberOfGroup);
            System.out.println("location = " + location);
            System.out.println("teacherInCharge = " + teacherInCharge);



        } else {
            System.out.println("Not invalid Group Number");
        }

    }
}
