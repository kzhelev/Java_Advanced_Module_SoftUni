package FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> function = e -> {
            int smallestNumber = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < e.size(); i++) {
                if (e.get(i) <= smallestNumber) {
                    smallestNumber = e.get(i);
                    index = i;
                }
            }
            return index;
        };

        int smallestNumberIndex = function.apply(intList);

        System.out.println(smallestNumberIndex);
    }
}
