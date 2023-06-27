package Exam;

import java.util.*;
import java.util.stream.Collectors;

public class FirstExc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> tools = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> substances = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.reverse(substances);

        List<Integer> challenges =  Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        boolean harryWin = false;

        while (true) {

            int compilation = tools.get(0) * substances.get(0);

            boolean contains = false;
            int index = 0;

            for (int i = 0; i < challenges.size(); i++) {

                if (challenges.get(i) == compilation) {
                    contains = true;
                    index = i;
                    break;
                }
            }

            if (contains) {

                challenges.remove(index);
                tools.remove(0);
                substances.remove(0);

            } else {

                tools.add(tools.get(0) + 1);
                tools.remove(0);

                if (substances.get(0) - 1 != 0) {
                    substances.set(0, substances.get(0) - 1);
                } else {
                    substances.remove(0);
                }
            }

            if (challenges.size() == 0) {
                harryWin = true;
                System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
                break;
            }

            if (tools.size() == 0 || substances.size() == 0) {
                System.out.println("Harry is lost in the temple. Oblivion awaits him.");
                break;
            }
        }

        if (tools.size() > 0) {
            String toolsRemaining = tools.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("Tools: %s\n", toolsRemaining);
        }

        Collections.reverse(substances);

        if (substances.size() > 0) {
            String substancesRemaining = substances.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("Substances: %s\n", substancesRemaining);
        }

        if (challenges.size() > 0) {
            String challengesRemaining = challenges.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("Challenges: %s\n", challengesRemaining);
        }
    }
}
