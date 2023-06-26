package day38_Inheritance.animal;

public class AnimalObj {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Cakıl", "Cat", "Brown", 5, 'M', 150);
        Dog dog1 = new Dog("Serbia", "Dog", "Black", 6, 'F', 52);

        cat1.eat();
        dog1.eat();
    }
}
