package FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("Party!")) {
            guests = commandExecution(guests, command);
            command = scanner.nextLine().split("\\s+");
        }

        if (guests.size() != 0) {
            System.out.println(guests.stream().sorted().collect(Collectors.joining(", ")) + " are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }

    private static List<String> commandExecution(List<String> guests, String[] command) {
        Predicate<String> predicate;
        List<String> guestToBeAdd;
        switch (command[0]) {
            case "Remove":
                switch (command[1]) {
                    case "StartsWith":
                        predicate = e -> !e.startsWith(command[2]);
                        guests = guests.stream().filter(predicate::test).collect(Collectors.toList());
                        break;
                    case "EndsWith":
                        predicate = e -> !e.endsWith(command[2]);
                        guests = guests.stream().filter(predicate::test).collect(Collectors.toList());
                        break;
                    case "Length":
                        predicate = e -> e.length() != Integer.parseInt(command[2]);
                        guests = guests.stream().filter(predicate::test).collect(Collectors.toList());
                        break;
                }
                break;
            case "Double":
                switch (command[1]) {
                    case "StartsWith":
                        predicate = e -> e.startsWith(command[2]);
                        guestToBeAdd = guests.stream().filter(predicate::test).collect(Collectors.toList());
                        guests.addAll(guestToBeAdd);
                        break;
                    case "EndsWith":
                        predicate = e -> e.endsWith(command[2]);
                        guestToBeAdd = guests.stream().filter(predicate::test).collect(Collectors.toList());
                        guests.addAll(guestToBeAdd);
                        break;
                    case "Length":
                        predicate = e -> e.length() == Integer.parseInt(command[2]);
                        guestToBeAdd = guests.stream().filter(predicate::test).collect(Collectors.toList());
                        guests.addAll(guestToBeAdd);
                        break;
                }
                break;
        }
        return guests;
    }
}
