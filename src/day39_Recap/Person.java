package day39_Recap;

import java.util.Collections;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("Name is empty: "+ name);
            System.exit(0);
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid Age: "+ age);
            System.exit(0);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender=='M'||gender=='F')){
            System.err.println("Invalid Gender: "+ gender);
            System.exit(0);
        }

        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void eat(){
        System.out.println(name+" person is eating.");
    }


    public void drink(){
        System.out.println(name+" person is drinking.");
    }


    public void sleep(){
        System.out.println(name+" person is sleeping.");
    }
}

/*
CydeoTask:
    1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()

    2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()

    3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()

    4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()

    5. Create a sub class of Employee named Teacher

            Override the work method


    6. Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()

    7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */