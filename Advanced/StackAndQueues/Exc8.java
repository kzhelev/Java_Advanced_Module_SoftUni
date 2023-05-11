package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Deque<String> stack = new ArrayDeque<>();
        Deque<String> stack2 = new ArrayDeque<>();
        String currentURL = null;
        String forwardURL = null;
        while (!"Home".equals(input)) {
            if ("back".equals(input)){
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    stack2.push(stack.pop());
                    currentURL = stack.peek();
                    System.out.println(currentURL);
                }
            } else if ("forward".equals(input)) {
                if (stack2.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    stack.push(stack2.peek());
                    forwardURL = stack2.pop();
                    System.out.println(forwardURL);
                }
            } else {
                stack.push(input);
                stack2.clear();
                currentURL = stack.peek();
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }
    }
}
