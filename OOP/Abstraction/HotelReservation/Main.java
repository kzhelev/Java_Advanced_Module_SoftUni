package Abstraction.HotelReservation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.printf("%.2f",priceCalculator.calculatePrice(Double.parseDouble(input[0]), Integer.parseInt(input[1])
                , Season.parseToSeason(input[2]), DiscountType.parseDiscountType(input[3])));
    }
}
