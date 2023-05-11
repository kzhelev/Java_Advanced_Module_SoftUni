package Polymorphism.WildFarm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         List<Animal> animals = new LinkedList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] animalInfo = input.split("\\s+");

            Animal animal = createAnimal(animalInfo);

            animal.makeSound();

            String[] foodInfo = scanner.nextLine().split("\\s+");

            try {
                animal.eat(food(foodInfo));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animals.add(animal);

            input = scanner.nextLine();

        }

        animals.forEach(System.out::println);

    }

    private static Animal createAnimal(String[] animalInfo) {
        String animalType = animalInfo[0];
        String animalName = animalInfo[1];
        double animalWeight = Double.parseDouble(animalInfo[2]);
        String livingRegion = animalInfo[3];

        switch (animalInfo[0]) {
            case "Cat":
                String breed = animalInfo[4];
                return new Cat(animalName,animalType,animalWeight,livingRegion,breed);
                
            case "Tiger":
                return new Tiger(animalName,animalType,animalWeight,livingRegion);

            case "Zebra":
                return new Zebra(animalName,animalType,animalWeight,livingRegion);

            case "Mouse"    :
                return new Mouse(animalName,animalType,animalWeight,livingRegion);


            default:
                throw new IllegalArgumentException("Invalid input!");
        }
    }

    public static Food food(String[] foodInfo) {
        int quantity = Integer.parseInt(foodInfo[1]);

        switch (foodInfo[0]) {
            case "Vegetable":
                return new Vegetable(quantity);

            case "Meat":
                return new Meat(quantity);

            default:throw new IllegalArgumentException("No such food type!");
        }
    }

}
