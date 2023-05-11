package Abstraction.CardRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Card Ranks:");
        if (input.equals("Card Ranks")) {
            Arrays.stream(CardRank.values()).forEach(CardRank::printInfo);
        }
    }
}
