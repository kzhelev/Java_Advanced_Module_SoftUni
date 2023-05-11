package DefiningClasses.Exercises.Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> peopleList = new LinkedHashMap<>();

        String input = scanner.nextLine();
        String[] infoInput;

        while (!input.equals("End")) {

            infoInput = input.split("\\s+");

            switch (infoInput[1]) {
                case "company":
                    if (!peopleList.containsKey(infoInput[0])) {
                        peopleList.put(infoInput[0], new Person(infoInput[0]));
                    }
                    peopleList.get(infoInput[0]).setCompany(infoInput[2],infoInput[3],Double.parseDouble(infoInput[4]));
                    break;
                case "pokemon":
                    if (!peopleList.containsKey(infoInput[0])) {
                        peopleList.put(infoInput[0], new Person(infoInput[0]));
                    }
                    peopleList.get(infoInput[0]).addPokemon(infoInput[2], infoInput[3]);
                    break;
                case "parents":
                    if (!peopleList.containsKey(infoInput[0])) {
                        peopleList.put(infoInput[0], new Person(infoInput[0]));
                    }
                    peopleList.get(infoInput[0]).addParent(infoInput[2], infoInput[3]);
                    break;
                case "children":
                    if (!peopleList.containsKey(infoInput[0])) {
                        peopleList.put(infoInput[0], new Person(infoInput[0]));
                    }
                    peopleList.get(infoInput[0]).addChild(infoInput[2], infoInput[3]);
                    break;
                case "car":
                    if (!peopleList.containsKey(infoInput[0])) {
                        peopleList.put(infoInput[0], new Person(infoInput[0]));
                    }
                    peopleList.get(infoInput[0]).setCar(infoInput[2],Integer.parseInt(infoInput[3]));
                    break;
            }
            input = scanner.nextLine();
        }

        String personToPrint = scanner.nextLine();

        printPersonsInfo(peopleList, personToPrint);

    }

    private static void printPersonsInfo(Map<String, Person> peopleList, String personToPrint) {
        System.out.println(peopleList.get(personToPrint).getName());
        System.out.println("Company:");
        if (peopleList.get(personToPrint).getCompany() != null) {
            System.out.printf("%s %s %.2f%n", peopleList.get(personToPrint).getCompany().getCompanyName(),
                    peopleList.get(personToPrint).getCompany().getDepartment(),
                    peopleList.get(personToPrint).getCompany().getSalary());
        }
        System.out.println("Car:");
        if (peopleList.get(personToPrint).getCar() != null) {
            System.out.printf("%s %d%n", peopleList.get(personToPrint).getCar().getModel(),
                    peopleList.get(personToPrint).getCar().getSpeed() );
        }
        System.out.println("Pokemon:");
        if (peopleList.get(personToPrint).getPokemons().size() != 0) {
            peopleList.get(personToPrint).getPokemons().stream().forEach(e -> System.out.printf("%s %s%n",
                    e.getPokemonName(),e.getPokemonType()));
        }
        System.out.println("Parents:");
        if (peopleList.get(personToPrint).getParents().size() != 0) {
            peopleList.get(personToPrint).getParents().stream().forEach(e -> System.out.printf("%s %s%n",
                    e.getParentName(),e.getParentBirthday()));
        }
        System.out.println("Children:");
        if (peopleList.get(personToPrint).getChildren().size() != 0) {
            peopleList.get(personToPrint).getChildren().stream().forEach(e -> System.out.printf("%s %s%n",
                    e.getChildName(),e.getChildBirthday()));
        }
    }
}
