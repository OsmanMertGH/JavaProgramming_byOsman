package day31_Constructors;

public class PizzaOrder {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Small", 0, 2);
        System.out.println(pizza1.calcCost());
    }
}
