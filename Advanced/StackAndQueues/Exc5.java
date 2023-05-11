package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<String> queues = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")){
                if (!queues.isEmpty()){
                    System.out.println("Canceled "+queues.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                queues.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String s : queues) {
            System.out.println(s);
        }
    }
}
