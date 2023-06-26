package day21_ForEachLoop;

import java.util.Arrays;

public class Initials {
    public static void main(String[] args) {

        String[] classMates = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : classMates) {
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {

                reversed += each.charAt(i);


            }

            System.out.println(reversed);

        }

    }

}
