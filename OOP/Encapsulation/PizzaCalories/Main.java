package Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInfo = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);

        String[] doughInfo = scanner.nextLine().split("\\s+");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        int weightInGrams = Integer.parseInt(doughInfo[3]);

        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);

            pizza.setDough(new Dough(flourType,bakingTechnique,weightInGrams));

            String input = scanner.nextLine();
            while (!input.equals("END")) {

                String[] toppingInfo = input.split("\\s+");
                String toppingName = toppingInfo[1];
                int toppingWeight = Integer.parseInt(toppingInfo[2]);

                pizza.addTopping(new Topping(toppingName,toppingWeight));
                input = scanner.nextLine();
            }

            System.out.println(pizza.toString());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
