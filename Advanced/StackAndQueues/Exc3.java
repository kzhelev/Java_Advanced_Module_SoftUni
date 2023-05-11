package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        Deque<Integer> toBinary = new ArrayDeque<>();

        if (input == 0) {
            System.out.println("0");
        }

        while (input != 0) {
            toBinary.push(input % 2);
            input /= 2;
        }

        while (!toBinary.isEmpty()) {
            System.out.print(toBinary.pop());
        }
    }
}
