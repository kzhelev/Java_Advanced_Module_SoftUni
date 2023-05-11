package FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.reverse(intList);

        int divider = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> predicate = e -> e % divider != 0;

        System.out.println(intList.stream().filter(predicate::test).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
