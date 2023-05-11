package FunctionalProgramming.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperBound = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 1; i <= upperBound; i++) {
            numbersList.add(i);
        }

        int[] dividers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Predicate<Integer> predicate = e -> {
            boolean isDivisible = true;

            for (int divider : dividers) {
                if (e % divider != 0) {
                    isDivisible = false;
                    break;
                }
            }

            return isDivisible;
        };

        System.out.println(numbersList.stream().filter(predicate::test).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
