package day31_Constructors;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public double calcCost() {
        double totalCost = 0;
        if (size.equals("Small")) {
            totalCost = 10 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
        } else if (size.equals("Medium")) {
            totalCost = 12 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
        } else {
            totalCost = 14 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
        }
        return totalCost;
    }
}

/*
Pizza Task:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */