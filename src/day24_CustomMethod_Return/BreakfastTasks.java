package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        InitialPerson("Osman", "Mert");
        domainOfMail("osmanmert@yahoo.com");

        monthName(2);
    }

    public static void InitialPerson(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
        System.out.println("initial = " + initial);
    }

    public static void domainOfMail(String mail) {

        String domainMail = mail.substring(mail.indexOf("@") + 1, mail.length());

        System.out.println("domainMail = " + domainMail);
    }

//3. Create a method that can display the name of the month based on the given number to the method

    public static void monthName(int monthNumber) {
        String monthName = (monthNumber == 1) ? "January" : (monthNumber == 2) ? "February" : "Others";

        System.out.println("monthName = " + monthName);

    }



}
/*
1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

 */