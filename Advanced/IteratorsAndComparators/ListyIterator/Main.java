package IteratorsAndComparators.ListyIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] command = input.split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < command.length; i++) {
            stringBuilder.append(String.valueOf(command[i])+",");
        }
        ListyIterator listyIterator = new ListyIterator(stringBuilder.toString().split(","));

        input = scanner.nextLine();

        while (!input.equals("END")) {

            command = input.split("\\s+");

            switch (command[0]) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    System.out.println(listyIterator.print());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    System.out.print(System.lineSeparator());
                    break;
            }

            input = scanner.nextLine();

        }
    }
}
