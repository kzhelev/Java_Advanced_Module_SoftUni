package IteratorsAndComparators.Froggy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Integer[] intArray = Arrays.stream(input.split(",\\s+")).map(Integer::parseInt).toArray(Integer[]::new);

        Lake lake = new Lake(intArray);

        List<String> forPrint = new ArrayList<>();

        for (Integer integer : lake) {
            forPrint.add(String.valueOf(integer));
        }

        System.out.println(String.join(", ", forPrint));
    }
}
