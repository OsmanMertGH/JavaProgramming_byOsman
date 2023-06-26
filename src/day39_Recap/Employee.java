package day39_Recap;

public class Employee extends Person {

    private String employeeID;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeID(String employeeID) {
        if (employeeID.isEmpty() || employeeID.isBlank()) {
            System.err.println("Invalid EmployeeID: " + employeeID);
            System.exit(0);
        }
        this.employeeID = employeeID;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Invalid jobTitle: " + jobTitle);
            System.exit(0);
        }
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Invalid Salary: " + salary);
            System.exit(0);
        }
        this.salary = salary;
    }


    public void work() {
        System.out.println(getName() + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + getName() + '\'' +
                "Age='" + getAge() + '\'' +
                "Gender='" + getGender() + '\'' +
                "employeeID='" + getEmployeeID() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
