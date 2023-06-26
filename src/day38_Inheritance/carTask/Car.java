package day38_Inheritance.carTask;

public class Car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public String color;
    public double miles;

    public Car(String brand, String model, int year, double price, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }

    public void start() {
        System.out.println(brand + " " + model + " " + " car started.");

    }

    public void drive() {
        System.out.println(brand + " " + model + " " + " car is driving.");
    }

}

/*
carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

		Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()

			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();




 */