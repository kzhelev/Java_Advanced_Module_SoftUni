package SetsAndMaps.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> phonebook = new HashMap<>();

        String[] command = scanner.nextLine().split("\\-");

        while (!command[0].equals("stop")) {
            if ("search".equals(command[0])) {
                command = scanner.nextLine().split("\\-");
                while (!command[0].equals("stop")) {
                    System.out.println(phonebook.containsKey(command[0]) ? command[0] + " -> " + phonebook.get(command[0]) :
                            "Contact " + command[0] + " does not exist.");
                    command = scanner.nextLine().split("\\-");
                }
                break;
            } else {
                phonebook.put(command[0], command[1]);
            }
            command = scanner.nextLine().split("\\-");
        }
    }
}
