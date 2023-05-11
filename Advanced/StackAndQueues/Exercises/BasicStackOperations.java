package StackAndQueues.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        String input2 = scanner.nextLine();
        int[] inputIntArr = Arrays.stream(input2.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(inputIntArr[i]);
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            boolean isIn = false;
            List<Integer> smallestNumber = new ArrayList<>();
            for (Integer integer : stack) {
                if (integer == x) {
                    isIn = true;
                    System.out.println(isIn);
                }
                smallestNumber.add(integer);
            }
            if (!isIn) {
                List<Integer> a = smallestNumber.stream().sorted().collect(Collectors.toList());
                System.out.println(a.get(0));
            }
        }


    }
}
