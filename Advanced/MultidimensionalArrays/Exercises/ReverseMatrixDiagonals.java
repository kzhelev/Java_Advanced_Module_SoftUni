package MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndColumns[0];
        int columns = rowsAndColumns[1];

        int[][] intArray = getArr(scanner, rows, columns);

        for (int i = columns-1; i >= 0 ; i--) {
            System.out.print(intArray[rows-1][i] + " ");
            int x = i;
            int y = rows-1;
            while (x != columns-1 && y != 0) {
                x++;
                y--;
                System.out.print(intArray[y][x] + " ");
            }
            System.out.println();
        }

        for (int i = intArray.length - 2; i >= 0; i--) {
            System.out.print(intArray[i][0] + " ");
            int x = i;
            int y = 0;
            while (x != 0 && y != columns-1) {
                x--;
                y++;
                System.out.print(intArray[x][y] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getArr(Scanner scanner, int rows, int columns) {
        int[][] intArr = new int[rows][columns];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return intArr;
    }
}
