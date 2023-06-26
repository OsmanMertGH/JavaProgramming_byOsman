package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("Osman", 84565, 'M', "Seller", 5000, true);
        employee2.setInfo("Burcu", 56595, 'F', "Programmer", 6000, false);
        employee3.setInfo("Hasan", 48656, 'M', "Architect", 9000, true);
        employee4.setInfo("Merve", 45654, 'F', "Seller", 4584, false);
        employee5.setInfo("Selim", 84534, 'M', "Driver", 2500, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        ArrayList<Employee> fullTimeEmployees = new ArrayList<>();

        int maxSalary = employee1.salary;
        int minSalary = employee1.salary;
        for (Employee each : employees) {
            if (each.isFullTime == true) {
                fullTimeEmployees.add(each);
            }

            if (each.salary > maxSalary) {
                maxSalary = each.salary;
            }

            if (each.salary < minSalary) {
                minSalary = each.salary;
            }
        }

        System.out.println("fullTimeEmployees = " + fullTimeEmployees);
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);
    }
}