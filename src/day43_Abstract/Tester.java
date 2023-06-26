package day43_Abstract;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(name+" "+jobTitle+" testing");
    }

    @Override
    public void sleep() {
        System.out.println(name+" "+jobTitle+" sleeping");
    }


}
