package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Deque<String> stack = new ArrayDeque<>();
        String currentURL = null;

        while (!"Home".equals(input)) {
            if ("back".equals(input)){
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    stack.pop();
                    currentURL = stack.peek();
                    System.out.println(currentURL);
                }
            } else {
               stack.push(input);
                currentURL = stack.peek();
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }
    }
}
