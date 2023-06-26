package day39_Recap;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String employeeID, double salary) {
        super(name, age, gender, employeeID, "Developer", salary);
    }

    public void work() {
        System.out.println(getName() +" "+getJobTitle()+ " is working.");
    }

    public void fixingBugs() {
        System.out.println(getName() +" "+getJobTitle()+ " is fixing bugs.");
    }
}
