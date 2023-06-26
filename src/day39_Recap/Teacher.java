package day39_Recap;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, String employeeID,  double salary) {
        super(name, age, gender, employeeID, "Teacher", salary);
    }

    public void work() {
        System.out.println(getName() +" "+getJobTitle()+ " is working.");
    }


}
