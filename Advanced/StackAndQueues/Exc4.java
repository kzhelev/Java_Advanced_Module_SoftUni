package StackAndQueues;

import java.util.*;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] inputAsCharArr = input.toCharArray();
        Deque<String> stack = new ArrayDeque<>();
        String workString = null;
        String workString2 = null;

        for (int i = 0; i < inputAsCharArr.length; i++) {
            if (inputAsCharArr[i] == '(') {
                    stack.push(String.valueOf(inputAsCharArr[i]));
            } else if (inputAsCharArr[i] == ')') {
                workString = stack.pop();
                stack.push(workString+String.valueOf(inputAsCharArr[i]));
                workString = stack.peek();
                System.out.println(stack.pop());
                if (!stack.isEmpty()) {
                    workString2 = stack.pop();
                    stack.push(workString2 + workString);
                }

            } else {
                if (!stack.isEmpty()) {
                    workString = stack.pop();
                    stack.push(workString + String.valueOf(inputAsCharArr[i]));
                } else {
                    stack.push(workString + String.valueOf(inputAsCharArr[i]));
                }
            }
        }
    }
}
