package Abstraction.CardSuit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Card Suits:");
        if (input.equals("Card Suits")) {
            Arrays.stream(CardSuit.values()).forEach(CardSuit::printInfo);
        }
    }
}
