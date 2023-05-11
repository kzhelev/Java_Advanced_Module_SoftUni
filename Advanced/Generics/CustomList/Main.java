package Generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();

        while (!input.equals("END")) {

            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Add":
                    customList.add(command[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(command[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(command[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(command[1]), Integer.parseInt(command[2])) ;
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(command[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    customList.sort();
                    break;
                case "Print":
                    for (int i = 0; i < customList.size(); i++) {
                        System.out.println(customList.get(i));
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
