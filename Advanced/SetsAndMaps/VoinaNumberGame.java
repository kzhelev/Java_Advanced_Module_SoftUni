package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> playerOne = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).limit(20)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> playerTwo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).limit(20)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        boolean ended = false;

        while (rounds > 0) {

            Iterator<Integer> iterator = playerOne.iterator();
            int firstCardP1 = iterator.next();
            playerOne.remove(firstCardP1);

            Iterator<Integer> iterator2 = playerTwo.iterator();
            int firstCardP2 = iterator2.next();
            playerTwo.remove(firstCardP2);

            if (firstCardP1 > firstCardP2) {
                playerOne.add(firstCardP1);
                playerOne.add(firstCardP2);
            } else if (firstCardP1 < firstCardP2){
                playerTwo.add(firstCardP1);
                playerTwo.add(firstCardP2);
            }


            if (playerOne.isEmpty() || playerTwo.isEmpty()) {
                ended = true;
                if (playerOne.isEmpty() && playerTwo.isEmpty()) {
                    System.out.println("Draw!");
                } else if (playerOne.isEmpty()) {
                    System.out.println("Second player win!");
                } else {
                    System.out.println("First player win!");
                }
                break;
            }
            rounds--;
        }
        if (rounds == 0 && !ended) {
            int count1 = playerOne.size();
            int count2 = playerTwo.size();

            if (count1 > count2) {
                System.out.println("First player win!");
            } else if (count1 == count2) {
                System.out.println("Draw!");
            } else {
                System.out.println("Second player win!");
            }
        }
    }
}
