package DefiningClasses.Exercises.PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainersList = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {

            addNewTrainer(input, trainersList);

            input = scanner.nextLine();
        }

        while (!input.equals("End")) {

            switch (input) {
                case "Fire":
                    calculation(input, trainersList);
                    checkPokemonHealth(trainersList);

                    break;
                case "Electricity":
                    calculation(input, trainersList);
                    checkPokemonHealth(trainersList);
                    break;
                case "Water":
                    calculation(input, trainersList);
                    checkPokemonHealth(trainersList);
                    break;
            }

            input = scanner.nextLine();
        }

        trainersList.entrySet().stream().sorted((f, s) -> {
                    if (f.getValue().getNumberOfBadges() < s.getValue().getNumberOfBadges()) {
                        return 1;
                    } else if (f.getValue().getNumberOfBadges() > s.getValue().getNumberOfBadges()) {
                        return -1;
                    } else {
                        return 1;
                    }
                })
                .forEach(e -> e.getValue().printInfo());
    }

    private static void checkPokemonHealth(Map<String, Trainer> trainersList) {
        for (Trainer trainer : trainersList.values()) {
            for (int i = 0; i < trainer.getCollectionOfPokemons().size(); i++) {
                if (!trainer.getCollectionOfPokemons().get(i).isAlive()){
                    trainer.getCollectionOfPokemons().remove(i);
                    i--;
                }
            }
        }
    }

    private static void addNewTrainer(String input, Map<String, Trainer> trainersList) {
        String[] trainerInfo = input.split("\\s+");

        if (!trainersList.containsKey(trainerInfo[0])) {
            trainersList.put(trainerInfo[0], new Trainer(trainerInfo[0]));
            trainersList.get(trainerInfo[0]).addPokemonInCollection(new Pokemon(trainerInfo[1], trainerInfo[2],
                    Integer.parseInt(trainerInfo[3])));
        } else {
            trainersList.get(trainerInfo[0]).addPokemonInCollection(new Pokemon(trainerInfo[1], trainerInfo[2],
                    Integer.parseInt(trainerInfo[3])));
        }
    }

    private static void calculation(String input, Map<String, Trainer> trainersList) {
        for (Map.Entry<String, Trainer> trainerEntry : trainersList.entrySet()) {
            if (!trainerEntry.getValue().addBadge(input)) {
                trainerEntry.getValue().getCollectionOfPokemons().forEach(Pokemon::healthLoose);
            }
        }
    }


}
