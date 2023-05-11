package MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(",\\s+");

        int rowsAndColumns = Integer.parseInt(command[0]);
        String patter = command[1];

        int[][] array = new int[rowsAndColumns][rowsAndColumns];

        switch (patter) {
            case "A":
                patternA(array);
                break;
            case "B":
                patternB(array);
                break;
        }

        printArr(array);

    }

    private static void printArr(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void patternA(int[][] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[j][i] = counter;
                counter++;
            }
        }
    }

    private static void patternB(int[][] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[j][i] = counter;
                    counter++;
                }
            } else {
                for (int j = array[i].length-1; j >= 0; j--) {
                    array[j][i] = counter;
                    counter++;
                }
            }
        }
    }
}
