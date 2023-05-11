package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArray = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> Character.isUpperCase(e.charAt(0))).toArray(String[]::new);

        System.out.println(stringArray.length);
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
