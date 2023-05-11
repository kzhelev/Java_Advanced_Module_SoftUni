package Abstraction.HotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    public int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }

    public static Season parseToSeason(String string) {
        return Season.valueOf(string.toUpperCase());
    }
}
