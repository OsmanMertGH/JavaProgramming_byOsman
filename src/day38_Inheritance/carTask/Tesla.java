package day38_Inheritance.carTask;

public class Tesla extends Car {
    public Tesla(String brand, String model, int year, double price, String color, double miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot() {
        System.out.println(brand + " " + model + " has autopilot.");
    }


}
/*
3. Tesla:
					extra methods:
						autoPilot();
 */