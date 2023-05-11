package StackAndQueues.Exercises;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] memory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        memory = new long[number+1];
        long result = getFibonacciNumb(number);
        System.out.println(result);
    }

    public static long getFibonacciNumb(int number) {
        if (number < 2) {
            return 1;
        }
        if (memory[number] != 0) {
            return memory[number];
        }
        memory[number] = getFibonacciNumb(number -1) + getFibonacciNumb(number-2);
        return memory[number];
    }
}
