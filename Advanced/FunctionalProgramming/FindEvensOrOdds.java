package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int lowerBound = input[0];
        int upperBound = input[1];

        String command = scanner.nextLine();

        List<Integer> intList = new ArrayList<>();

        for (int i = lowerBound; i <= upperBound; i++) {
            intList.add(i);
        }

        printSelectedNumbers(command, intList);
    }

    private static void printSelectedNumbers(String command, List<Integer> intList) {
        if (command.equals("odd")) {
            Predicate<Integer> predicate = e -> e % 2 != 0;
            intList.stream().filter(e -> predicate.test(e)).forEach(e -> System.out.print(e+" "));
        } else if (command.equals("even")) {
            Predicate<Integer> predicate = e -> e % 2 == 0;
            intList.stream().filter(e -> predicate.test(e)).forEach(e -> System.out.print(e+" "));
        } else {
            throw new IllegalArgumentException("Unknown command");
        }
    }
}
