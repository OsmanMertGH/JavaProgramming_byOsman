package day31_Constructors.ScrumTask;

public class Developer {

    public String name, jobTitle;
    public int employeeID, salary;

    public Developer(String name, String jobTitle, int employeeID, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }

    public void coding() {
        System.out.println(name + " is coding.");
    }

    public void unitTesting() {
        System.out.println(name + " making unitTesting");
    }

    public void fixingBug() {
        System.out.println(name + " is fix the bugs");
    }

}


/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()

 */