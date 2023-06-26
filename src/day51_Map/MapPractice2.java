package day51_Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new LinkedHashMap<>();
        employeeMap.put("Ddene", 123000);
        employeeMap.put("Winfred", 100000);
        employeeMap.put("Jereme", 115000);
        employeeMap.put("Glad", 110000);
        employeeMap.put("Desirae", 85000);
        employeeMap.put("Kakalina", 117000);
        employeeMap.put("Bertrando", 118000);
        employeeMap.put("Ajay", 125000);
        employeeMap.put("Brigitte", 135000);
        employeeMap.put("Derk", 119000);

        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> eachPair : employeeMap.entrySet()) {
            Integer eachValue = eachPair.getValue();
            String eachKey = eachPair.getKey();

            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                name1 = eachKey;
            }

            if (eachValue < minSalary) {
                minSalary = eachValue;
                name2 = eachKey;
            }
        }
        System.out.println("maxSalary = " + name1);

        System.out.println("minSalary = " + name2);

        System.out.println("------------------------------------------------------------");

        int count = 0;

        for (Integer eachValue : employeeMap.values()) {
            if (eachValue > 120000 && eachValue < 150000) {
                count++;
            }

        }
        System.out.println(count);


        System.out.println("------------------------------------------------------------");


        for (Map.Entry<String, Integer> eachPair : employeeMap.entrySet()) {
            Integer eachValue = eachPair.getValue();
            String eachKey = eachPair.getKey();

            if (eachValue < 118000) {
                System.out.println(eachKey);
            }
        }

        for (Map.Entry<String, Integer> eachPair : employeeMap.entrySet()) {
            String eachKey = eachPair.getKey();
            Integer eachValue = eachPair.getValue();

            employeeMap.replace(eachKey,eachValue,eachValue+10000);
        }

        System.out.println(employeeMap);
    }
}
