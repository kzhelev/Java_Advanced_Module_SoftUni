package Abstraction.RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        printRhombusSecondMethod(size);

    }

    public static void printRhombus(int size) {
        String first = " ";
        String second = "* ";
        printTop(first, second, size);
        printBottom(first, second, size);
    }

    public static void printTop(String first, String second, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(first);
            }

            for (int j = 0; j < i; j++) {
                System.out.print(second);
            }
            System.out.print(System.lineSeparator());
        }
    }

    public static void printBottom(String first, String second, int size) {
        for (int i = 1; i <= size; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(first);
            }

            for (int j = 0; j < size - i; j++) {
                System.out.print(second);
            }

            System.out.print(System.lineSeparator());
        }
    }

    public static void printTriangle(int count, int count2) {

        for (int j = 0; j < count; j++) {
            System.out.print(" ");
        }

        for (int j = 0; j < count2; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }

    public static void printRhombusSecondMethod(int size) {
        for (int i = 1; i <= size; i++) {
            int count = i;
            int count2 = size-i;
            printTriangle(count2,count);
        }
        for (int i = 1; i <= size ; i++) {
            int count = i;
            int count2 = size-i;
            printTriangle(count,count2);
        }
    }
}
