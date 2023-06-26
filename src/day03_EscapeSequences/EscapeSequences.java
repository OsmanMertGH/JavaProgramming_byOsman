package day03_EscapeSequences;
/*
  escape sequences: MUST be given with double quote
  \n: starts a new line
  \t: Paragraph Space (Tab)
  \\: Single back slash
  \": Print double code
   */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("--------------------");

        System.out.println("Hello Cydeo. \nHow are u? \nIts nice to see you all! \nWhat class do we next week?");

        System.out.println("---------------------------------------");

        System.out.println("\tJava is Cool Programming Language");
        System.out.println("--------------------------");

        System.out.println("/ \\"); //in order to print one backward slash we need to give two backward slashes

        System.out.println("My favorite TV show is \"Game of Thrones\"");
    }

}
