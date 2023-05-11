package FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            intList = commandExecution(command, intList);
            command = scanner.nextLine();
        }


    }

    private static List<Integer> commandExecution(String command, List<Integer> intList) {

        switch (command) {
            case "add":
                intList = intList.stream().map(e -> e+1).collect(Collectors.toList());
                break;
            case "multiply":
                intList = intList.stream().map(e -> e*2).collect(Collectors.toList());
                break;
            case "subtract":
                intList = intList.stream().map(e -> e-1).collect(Collectors.toList());
                break;
            case "print":
                System.out.println(intList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                break;
            default: throw new IllegalArgumentException("Unknown command: " + command);
        }
        return intList;
    }
}
