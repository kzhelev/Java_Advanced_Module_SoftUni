package SetsAndMaps.Exercises;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playerAndPower = new LinkedHashMap<>();

        String[] command = scanner.nextLine().split(":\\s+");
        String[] playersCards;

        while (!"JOKER".equals(command[0])) {

            playersCards = command[1].split(",\\s+");

            if (!playerAndPower.containsKey(command[0])) {

                playerAndPower.put(command[0],new HashSet<>());

                for (String card : playersCards) {
                    playerAndPower.get(command[0]).add(card);
                }

            } else {

                for (String card : playersCards) {
                    playerAndPower.get(command[0]).add(card);
                }

            }

            command = scanner.nextLine().split(":\\s+");

        }

        for (Map.Entry<String, Set<String>> entry : playerAndPower.entrySet()) {
            System.out.println(entry.getKey()+": "+getPower(entry.getValue()));
        }


    }

    private static int getPower(Set<String> playerCards) {
        int power = 0;
        int point = 0;
        for (String playerCard : playerCards) {
            switch (playerCard.charAt(0)) {
                case '2':
                    point = 2;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case '3':
                    point = 3;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case '4':
                    point = 4;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case '5':
                    point = 5;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case '6':
                    point = 6;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case '7':
                    point = 7;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case '8':
                    point = 8;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case '9':
                    point = 9;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case '1':
                    point = 10;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case 'J':
                    point = 11;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case 'Q':
                    point = 12;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case 'K':
                    point = 13;
                    power += plusMultiplier(power, playerCard, point);
                    break;
                case 'A':
                    point = 14;
                    power += plusMultiplier(power, playerCard, point);
                    break;
            }
        }
        return power;
    }

    private static int plusMultiplier(int power, String playerCard, int point) {
        switch (playerCard.charAt(1)) {
            case 'S':
                power = point * 4;
                break;
            case 'H':
                power = point * 3;
                break;
            case 'D':
                power = point * 2;
                break;
            case 'C':
                power = point;
                break;
            case '0':
                switch (playerCard.charAt(2)) {
                    case 'S':
                        power = point * 4;
                        break;
                    case 'H':
                        power = point * 3;
                        break;
                    case 'D':
                        power = point * 2;
                        break;
                    case 'C':
                        power = point;
                        break;
                }
                break;
        }
        return power;
    }
}
