package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings, numberOfHead;

    static {
        planet="World";
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;
    }

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                ", isHuman='" + isHuman + '\'' +
                ", hasNose='" + hasNose + '\'' +
                ", numberOfHead='" + numberOfHead + '\'' +
                ", numberOfWings='" + numberOfWings + '\'' +
                '}';
    }
}
