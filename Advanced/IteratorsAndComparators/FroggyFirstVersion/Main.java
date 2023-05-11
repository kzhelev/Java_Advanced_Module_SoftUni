package IteratorsAndComparators.FroggyFirstVersion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Lake lake = new Lake();

        while (!input.equals("END")) {

            int[] intArray = Arrays.stream(input.split(",\\s+")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < intArray.length; i++) {
                lake.add(intArray[i]);
            }

            input = scanner.nextLine();
        }

        List<String> forPrint = new ArrayList<>();

        for (Integer integer : lake) {
            forPrint.add(String.valueOf(integer));
        }

        System.out.println(String.join(", ", forPrint));
    }
}
