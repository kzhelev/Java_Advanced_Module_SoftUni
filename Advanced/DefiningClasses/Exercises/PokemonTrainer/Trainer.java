package DefiningClasses.Exercises.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges = 0;
    private List<Pokemon> collectionOfPokemons;

    public Trainer(String name) {
        this.name = name;
        collectionOfPokemons = new ArrayList<>();
    }

    public List<Pokemon> getCollectionOfPokemons() {
        return collectionOfPokemons;
    }

    public void addPokemonInCollection (Pokemon pokemon) {
        collectionOfPokemons.add(pokemon);
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public boolean addBadge(String element) {
        boolean badgesAdded = false;
        for (Pokemon pokemon : collectionOfPokemons) {
            if (pokemon.getElement().equals(element)) {
                numberOfBadges++;
                badgesAdded = true;
                break;
            }
        }
        return badgesAdded;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.printf("%s %d %d%n",this.getName(),this.getNumberOfBadges(),this.getCollectionOfPokemons().size());
    }

    @Override
    public String toString() {
        return String.format("%s %d %d%n",this.getName(),this.getNumberOfBadges(),this.collectionOfPokemons.size());
    }

}
