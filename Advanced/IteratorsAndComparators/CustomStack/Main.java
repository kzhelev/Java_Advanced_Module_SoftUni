package IteratorsAndComparators.CustomStack;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomStack customStack = new CustomStack();

        while (!input.equals("END")) {

            String[] command = input.split(" ",2);

            switch (command[0]) {
                case "Push":
                    int[] pushInts = Arrays.stream(command[1].split(",\\s+")).map(String::trim).mapToInt(Integer::parseInt).toArray();

                    for (int i = 0; i < pushInts.length; i++) {
                        customStack.push(pushInts[i]);
                    }
                    break;
                case "Pop":
                    customStack.pop();
                    break;
            }
            input = scanner.nextLine();
        }

        customStack.printAll();

    }
}
