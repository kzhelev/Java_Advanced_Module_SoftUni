package StackAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input1Arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = input1Arr[0];
        int s = input1Arr[1];
        int x = input1Arr[2];
        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> queue = new ArrayDeque<>();

        if (n == s) {
            System.out.println("0");
        } else {
            for (int i = 0; i < n; i++) {
                queue.offer(inputArr[i]);
            }
            for (int i = 0; i < s; i++) {
                queue.poll();
            }
            boolean found = false;
            for (Integer integer : queue) {
                if (integer == x) {
                    System.out.println(true);
                    found = true;
                }
            }
            int smallestNumber = Integer.MAX_VALUE;
            if (!found) {
                for (Integer integer : queue) {
                    if (integer < smallestNumber) {
                        smallestNumber = integer;
                    }
                }
                System.out.println(smallestNumber);
            }
        }
    }
}
