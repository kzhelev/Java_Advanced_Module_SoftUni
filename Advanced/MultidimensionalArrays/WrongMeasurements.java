package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] array = getArr(scanner,rows);

        int columnsOfTheArray = array[0].length;

        int[] numberRC = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int row = numberRC[0];
        int column = numberRC[1];

        int number = array[row][column];

        int[][] newArray = new int[rows][columnsOfTheArray];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columnsOfTheArray; j++) {
                if (array[i][j] == number) {
                    newArray[i][j] = getNearbySum(rows, columnsOfTheArray, array, i, j, number);
                } else {
                    newArray[i][j] = array[i][j];
                }
            }
        }

        printArr(newArray);
    }

    private static int getNearbySum(int rowsAndColumns, int columnsOfTheArray, int[][] array, int row, int column, int number) {
        int up;
        int down;
        int left;
        int right;

        if (row != 0) {
            up = array[row - 1][column];
            if (up == number) {
                up = 0;
            }
        } else {
            up = 0;
        }
        if (row != array.length-1) {
            down = array[row + 1][column];
            if (down == number) {
                down = 0;
            }
        } else {
            down = 0;
        }
        if (column != 0) {
            left = array[row][column - 1];
            if (left == number) {
                left = 0;
            }
        } else {
            left = 0;
        }
        if (column != columnsOfTheArray-1) {
            right = array[row][column+1];
            if (right == number) {
                right = 0;
            }
        } else {
            right = 0;
        }

        int sum = up+down+left+right;

        return sum;
    }

    private static void printArr(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] getArr(Scanner scanner, int rowsAndColumns) {
        int[][] intArr = new int[rowsAndColumns][];
        for (int i = 0; i < rowsAndColumns; i++) {
            intArr[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return intArr;
    }
}
