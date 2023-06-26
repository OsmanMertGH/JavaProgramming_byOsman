package day39_Recap;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Burcu", 29, 'M', "156484", 1200000);
        System.out.println(tester1);
        tester1.eat();
        tester1.work();
        tester1.drink();

        System.out.println("---------------------------------");

        Developer developer1 = new Developer("Osman", 30, 'F', "TTASG123", 205000);

        System.out.println(developer1);
        developer1.work();
        developer1.fixingBugs();
        System.out.println("---------------------------------");

        Teacher teacher1 = new Teacher("Muhtar", 34, 'F', "AGSA54", 5000000);
        System.out.println(teacher1);
        teacher1.work();
        System.out.println("---------------------------------");
        Student student1 = new Student("Okan", 25, 'F', "AGSAGH", "GGSAG353");
        System.out.println(student1);
        student1.eat();
        student1.study();
    }
}
