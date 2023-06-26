package day39_Recap;

public class Student extends Person {

    private String studentID, fieldOfStudy;

    public String getStudentID() {
        return studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setStudentID(String studentID) {
        if (studentID.isEmpty()) {
            System.err.println("Name is empty: " + studentID);
            System.exit(0);
        }

        this.studentID = studentID;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty()) {
            System.err.println("Name is empty: " + fieldOfStudy);
            System.exit(0);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int age, char gender, String studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public void study() {
        System.out.println(getName() + " " + getStudentID() + " Student is study.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
