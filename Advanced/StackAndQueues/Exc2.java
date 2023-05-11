package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Deque<String> queues = new ArrayDeque<>();
        int result = 0;
        String currentString;

        for (int i = 0; i < input.length; i++) {
            queues.offer(input[i]);
        }

        while (!queues.isEmpty()){
            currentString = queues.poll();
            if (!currentString.equals("+") && !currentString.equals("-")) {
                if (!queues.isEmpty()) {
                    result += Integer.parseInt(currentString);
                }
            } else if (currentString.equals("+")) {
                if (!queues.isEmpty()) {
                    result += Integer.parseInt(queues.poll());
                }
            } else {
                if (!queues.isEmpty()) {
                    result -= Integer.parseInt(queues.poll());
                }
            }
        }
        System.out.println(result);
    }
}
