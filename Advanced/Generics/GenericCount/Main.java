package Generics.GenericCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            list.add(Double.parseDouble(scanner.nextLine()));
        }

        Double greaterThen = Double.parseDouble(scanner.nextLine());

        countOfGreaterValues(list, greaterThen);

        System.out.println(list.size());

    }

    private static <T extends Comparable<T>> void countOfGreaterValues(List<T> list, T greaterThen) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).compareTo(greaterThen) < 1) {
                list.remove(i);
            }
        }
    }
}
