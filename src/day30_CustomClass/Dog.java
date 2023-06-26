package day30_CustomClass;

public class Dog {

    String name;
    int age;
    char gender;
    String breed;
    int size;
    String color;

    public void setInfo(String name, int age, char gender, String breed, int size, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(name + " eating");
    }

    public void play() {
        System.out.println(name + " playing");
    }

    public void bark() {
        System.out.println(name + " barking");
    }

}
