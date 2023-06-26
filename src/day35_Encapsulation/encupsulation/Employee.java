package day35_Encapsulation.encupsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private int salary;

    public Employee(String name, char gender, int age, int salary) {
        getName();
        getGender();
        getAge();
        getSalary();
    }

    public String getName(){
        return name;
    }

    public char getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public int getSalary(){
        return salary;
    }

    public void setName(String name){
        if (name.isEmpty()){
            return;
        }
        this.name=name;
    }

    public void setAge(int age){
        if (age>150&&age<=0){
            return;
        }
        this.age=age;
    }

    public void setGender(char gender){
        if (!(gender=='M'||gender=='F')){
            return;
        }
        this.gender=gender;
    }

    public void setSalary(int salary){
        if (salary<=0){
            return;
        }
        this.salary=salary;
    }

}
