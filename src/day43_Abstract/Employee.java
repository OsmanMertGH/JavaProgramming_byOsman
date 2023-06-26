package day43_Abstract;

public abstract class Employee {
    String name;
    int age;
    char gender;
    int id;
    String jobTitle;
    double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract void work();

    public abstract void sleep();

}
