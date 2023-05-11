package Inheritance.Animals;

public class Kitten extends Cat {

    private static final String CAT_GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, age, CAT_GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
