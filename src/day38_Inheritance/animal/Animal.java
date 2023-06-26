package day38_Inheritance.animal;

public class Animal {

    String name, breed, color;
    int age;
    char gender;
    double size;

    public Animal(String name, String breed, String color, int age, char gender, double size) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.size = size;
    }

    public void eat(){
        System.out.println(name+" "+breed+ " eating food.");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }
}
