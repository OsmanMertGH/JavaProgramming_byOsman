package day12_Scanner;
import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        
        String name=inp.nextLine();

        System.out.println("name = " + name);


        inp.close();
    }
}
