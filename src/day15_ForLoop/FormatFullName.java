package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastname = "SCHOOL";

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastname);


    }
}
