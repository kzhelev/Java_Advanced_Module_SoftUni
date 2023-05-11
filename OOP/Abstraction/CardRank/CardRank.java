package Abstraction.CardRank;

public enum CardRank {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private int power;

    CardRank(int power) {
        this.power = power;
    }

    public static CardRank parse(int ordinal) {
        switch (ordinal) {
            case 0:
                return ACE;
            case 1:
                return TWO;
            case 2:
                return THREE;
            case 3:
                return FOUR;
            case 4:
                return FIVE;
            case 5:
                return SIX;
            case 6:
                return SEVEN;
            case 7:
                return EIGHT;
            case 8:
                return NINE;
            case 9:
                return TEN;
            case 10:
                return JACK;
            case 11:
                return QUEEN;
            case 12:
                return KING;
            default:
                throw new IllegalArgumentException("Unknown command "+ordinal);
        }
    }

    public static CardRank parse(String string) {
        return CardRank.valueOf(string);
    }

    public void printInfo() {
        System.out.printf("Ordinal value: %d; Name value: %s%n",ordinal(), this);
    }
}
