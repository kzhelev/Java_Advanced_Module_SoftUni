package Abstraction.CardSuit;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    public int power;

    private CardSuit(int value) {
        this.power = value;
    }

    public static CardSuit parse(int ordinal) {
        switch (ordinal) {
            case 0:
                return CLUBS;
            case 1:
                return DIAMONDS;
            case 2:
                return HEARTS;
            case 3:
                return SPADES;
            default:
                throw new IllegalArgumentException("Unknown command "+ordinal);
        }
    }

    public static CardSuit parse(String string) {
        return CardSuit.valueOf(string);
    }

    public void printInfo() {
        System.out.printf("Ordinal value: %d; Name value: %s%n",ordinal(), this);
    }
}
