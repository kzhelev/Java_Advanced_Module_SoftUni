package Inheritance.Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!input.equals("Beast!")) {

            String animal = input;

            String[] animalInfo = scanner.nextLine().split("\\s+");

            String animalName = animalInfo[0];
            int animalAge = Integer.parseInt(animalInfo[1]);
            String animalGender;

            try {
                switch (animal) {
                    case "Dog":
                        animalGender = animalInfo[2];
                        animals.add(new Dog(animalName,animalAge,animalGender));
                        break;
                    case "Frog":
                        animalGender = animalInfo[2];
                        animals.add(new Frog(animalName,animalAge,animalGender));
                        break;
                    case "Cat":
                        animalGender = animalInfo[2];
                        animals.add(new Cat(animalName,animalAge,animalGender));
                        break;
                    case "Kitten":
                        animals.add(new Kitten(animalName,animalAge));
                        break;
                    case "Tomcat":
                        animals.add(new Tomcat(animalName,animalAge));
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal);

        }
    }
}
