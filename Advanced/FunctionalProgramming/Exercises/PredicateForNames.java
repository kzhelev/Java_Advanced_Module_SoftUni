package FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLength = Integer.parseInt(scanner.nextLine());

        Predicate<String> predicate = e -> e.length() <= maxLength;

        String[] stringArray = Arrays.stream(scanner.nextLine().split("\\s+")).filter(predicate::test).toArray(String[]::new);

        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
