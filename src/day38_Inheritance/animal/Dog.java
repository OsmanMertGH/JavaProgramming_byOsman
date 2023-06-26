package day38_Inheritance.animal;

public class Dog extends Animal{

    public Dog(String name, String breed, String color, int age, char gender, double size) {
        super(name, "Dog", color, age, gender, size);
    }

    public void eat(){
        System.out.println(name+" "+breed+" eating food.");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }
}
