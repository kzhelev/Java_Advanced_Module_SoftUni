package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>  listOfInts = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1)).limit(3)
                .collect(Collectors.toList());

        listOfInts.stream().forEach(e -> System.out.print(e+" "));
    }
}
