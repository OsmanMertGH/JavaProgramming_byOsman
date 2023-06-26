package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String brand, String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" is break down.");
    }

    public void racing() {
        System.out.println(brand + " " + model + " is racing.");
    }
}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */