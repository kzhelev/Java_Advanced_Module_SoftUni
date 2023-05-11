package Abstraction.HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private DiscountType discountType;
    private Season season;

    public double calculatePrice(double pricePerDay, int days, Season season, DiscountType discountType) {
        return pricePerDay * days * season.multiplier * discountType.discountRate;
    }
}
