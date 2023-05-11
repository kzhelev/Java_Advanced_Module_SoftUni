package Encapsulation.PizzaCalories;

public class Topping {

    private String type;
    private double weight;

    public Topping(String type, double weight) {
        setToppingType(type);
        setWeight(weight);
    }

    private void setToppingType(String type) {
        if (!type.equals("Meat") && !type.equals("Veggies") && !type.equals("Cheese") && !type.equals("Sauce")) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", type));
        }
        this.type = type;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", type));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        switch (type) {
            case "Meat":
                return 2 * weight * 1.2;
            case "Veggies":
                return 2 * weight * 0.8;
            case "Cheese":
                return 2 * weight * 1.1;
            case "Sauce":
                return 2 * weight * 0.9;
            default:
                throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", type));
        }
    }
}
