package Generics.GenericSwap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            list.add(Integer.parseInt(scanner.nextLine()));
        }

        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        swap(list, index1, index2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getClass().getName() + ": " + list.get(i));
        }

    }

    public static <T> void swap(List<T> list, int index1, int index2) {
        T workElement = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, workElement);
    }
}
