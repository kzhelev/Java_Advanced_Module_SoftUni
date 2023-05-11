package FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> comparator = (e1,e2) -> {
            int before = -1;
            int after = 1;
            int equal = 0;

            if (e1 % 2 == 0 && e2 % 2 == 0) {
                return e1 - e2;
            } else if (e1 % 2 == 0 && e2 % 2 != 0) {
                return before;
            } else if (e1 % 2 != 0 && e2 % 2 == 0) {
                return after;
            } else if (e1 % 2 != 0 && e2 % 2 != 0) {
                return e1 - e2;
            } else {
                return equal;
            }
        };

        intList.stream().sorted(comparator).forEach(e -> System.out.print(e+" "));
    }
}
