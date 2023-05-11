package Abstraction.HotelReservation;

public enum DiscountType {
    VIP(0.8),
    SECOND_VISIT(0.9),
    NONE(1);

    public double discountRate;

    DiscountType(double discountRate) {
        this.discountRate = discountRate;
    }

    public static DiscountType parseDiscountType(String string) {
        switch (string) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("Wrong command "+ string);
        }
    }
}
