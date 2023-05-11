package FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .filter(e -> e % 2 == 0).toArray();

        String output = Arrays.stream(intArray).boxed().map(String::valueOf).collect(Collectors.joining(", "));
        String outputSorted = Arrays.stream(intArray).sorted().boxed().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(output);
        System.out.println(outputSorted);


//        List<Integer> intList = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
//                .filter(e -> e % 2 == 0).collect(Collectors.toList());
//
//        System.out.println(intList.toString().replaceAll("[\\[\\]]",""));
//
//
//        System.out.println(intList.stream().sorted().map(Object::toString).collect(Collectors.joining(", ")));

    }
}
