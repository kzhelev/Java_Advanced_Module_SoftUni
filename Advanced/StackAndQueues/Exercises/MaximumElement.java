package StackAndQueues.Exercises;

import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loops = Integer.parseInt(scanner.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();

        String input2;
        int[] intArr;
        int maximum;

        for (int i = 0; i < loops; i++) {
            input2 = scanner.nextLine();
            intArr = Arrays.stream(input2.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            switch (intArr[0]) {
                case 1:
                    stack.push(intArr[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    maximum = Integer.MIN_VALUE;
                    for (Integer integer : stack) {
                        stack.add(stack.peek());
                        if (maximum < stack.peek()) {
                            maximum = stack.pop();
                        } else {
                            stack.pop();
                        }
                    }
                    System.out.println(maximum);
                    break;
            }
        }
    }
}
