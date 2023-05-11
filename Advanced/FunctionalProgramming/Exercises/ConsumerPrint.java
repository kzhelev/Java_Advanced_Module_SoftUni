package FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> consumer = e -> System.out.println(e);

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(consumer::accept);


    }
}
