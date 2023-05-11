package SetsAndMaps.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstOne = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondOne = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int counter = 0;
        if (firstOne.length <= secondOne.length) {
            for (int i = 0; i < firstOne.length; i++) {
                for (int j = counter; j < secondOne.length; j++) {
                    if (firstOne[i] < secondOne[j]) {
                        counter = j;
                        break;
                    } else if (firstOne[i] == secondOne[j]) {
                        counter = j+1;
                        System.out.print(firstOne[i]+" ");
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < secondOne.length; i++) {
                for (int j = counter; j < firstOne.length; j++) {
                    if (secondOne[i] < firstOne[j]) {
                        counter = j;
                        break;
                    } else if (secondOne[i] == firstOne[j]) {
                        counter = j+1;
                        System.out.print(secondOne[i]+" ");
                        break;
                    }
                }
            }
        }
    }
}
