package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Count = " + intArray.length);
        System.out.println("Sum = " + Arrays.stream(intArray).sum());
    }
}
