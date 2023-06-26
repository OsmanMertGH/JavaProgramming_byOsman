package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        str = StringUtility.reverse(str);

        System.out.println();
        System.out.println("Reverse Str = " + str);


        System.out.println("----------------------");

        String str2 = "küçük";
        boolean result = StringUtility.isPolindrom(str2);
        System.out.println("Palindrom = " + result);

        System.out.println("----------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPolindrom(each)) {
                count++;
            }

        }
        System.out.println(count);

        System.out.println("-------------------");

        String str3="aaaabbbbccjjjkkk";
        String result2=StringUtility.removeDuplicates(str3);

        System.out.println(result2);

    }


}
