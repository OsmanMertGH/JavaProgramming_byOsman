package day30_CustomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public char grade;

    public void setInfo(String name, char gender, int age, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
