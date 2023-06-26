package day38_Inheritance.carTask;

public class Toyota extends Car {

    public Toyota(String brand, String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable() {
        System.out.println(brand + " " + model + " " + " car is reliable.");
    }

}
/*
Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()

 */