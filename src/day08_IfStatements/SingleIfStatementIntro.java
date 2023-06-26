package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 302;

        boolean evenNumber = number % 2 == 0;

        if (evenNumber){

            System.out.println(number+" is even number");
        }

        if (!evenNumber) {
            System.out.println(number + " is odd number");
        }

        System.out.println("--------------------------");

        int n=0;

        if (n>0){

            System.out.println("Pozitif = " + n);
        }

        if (n<0){

            System.out.println("Negatif =" +n);
        }

        if (n==0){

            System.out.println("Zero ="+ n);
        }

    }
}
