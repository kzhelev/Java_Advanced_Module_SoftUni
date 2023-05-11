package StackAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> players = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int moves = Integer.parseInt(scanner.nextLine());

        Deque<String> stack = new ArrayDeque<>();

        int counter = 0;
        if (moves == 1) {
            for (int i = 0; i < players.size() - 1; i++) {
                System.out.println("Removed " + players.get(i));
            }
            System.out.println("Last is " + players.get(players.size() - 1));
        } else {
            while (players.size() != 1) {
                for (int i = 0; i < players.size(); i++) {
                    stack.push(players.get(i));
                    counter++;
                    if (counter == moves) {
                        for (int j = 0; j < players.size(); j++) {
                            if (players.get(j).equals(stack.peek())) {
                                System.out.println("Removed " + players.get(j));
                                players.remove(j);
                                i--;
                                stack.clear();
                                break;
                            }
                        }
                        counter = 0;
                    }
                }
            }
            System.out.println("Last is " + players.get(0));
        }
    }
}
