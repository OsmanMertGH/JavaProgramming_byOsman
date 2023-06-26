package day38_Inheritance.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, String color, int age, char gender, double size) {
        super(name, "Cat", color, age, gender, size);
    }

    public void eat(){
        System.out.println(name+" "+breed+" eating food.");
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }
}
