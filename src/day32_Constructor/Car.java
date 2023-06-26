package day32_Constructor;

public class Car {

    public String brand, model, color;
    public double year, price;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, double year) {
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, double year, double price) {
        this(brand, model, year);
        this.price = price;
    }
}

