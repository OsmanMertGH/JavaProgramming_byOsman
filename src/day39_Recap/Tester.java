package day39_Recap;

public class Tester extends Employee {

    public Tester(String name,int age, char gender, String employeeID, double salary) {
        super(name, age, gender, employeeID, "Tester", salary);
    }

    public void createTicket() {
        System.out.println(getName() +" "+getJobTitle()+ " is creating ticket.");
    }

    public void work() {
        System.out.println(getName() +" "+getJobTitle()+ " is working.");
    }
}
