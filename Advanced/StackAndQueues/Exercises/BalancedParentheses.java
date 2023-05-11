package StackAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            queue.offer(input[i]);
        }
        boolean isBalanced = true;
        if (input.length % 2 != 0) {
            System.out.println("NO");
        } else {
            for (int i = input.length-1; i >= input.length/2 ; i--) {
                if (queue.peek() == '('){
                    queue.poll();
                    if (input[i] != ')') {
                        isBalanced = false;
                    }
                }else if (queue.peek() == '['){
                    queue.poll();
                    if (input[i] != ']') {
                        isBalanced = false;
                    }
                } else if (queue.peek() == '{'){
                    queue.poll();
                    if (input[i] != '}') {
                        isBalanced = false;
                    }
                }
            }
            if (isBalanced) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
