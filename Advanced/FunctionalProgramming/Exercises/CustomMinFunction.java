package FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<List<Integer>, Integer> function = e -> {
            int smallestNumber = Integer.MAX_VALUE;
            for (int i = 0; i < e.size(); i++) {
                if (e.get(i) < smallestNumber) {
                    smallestNumber = e.get(i);
                }
            }
          return smallestNumber;
        };

        List<Integer> intArray = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(function.apply(intArray));
    }
}
