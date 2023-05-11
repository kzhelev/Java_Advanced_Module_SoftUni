package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstLine = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = firstLine[0];
        int colum = firstLine[1];

        int[][] intArray = getArr(scanner, row, colum);

        int sum = getElementsSum(intArray);

        System.out.println(row);
        System.out.println(colum);
        System.out.println(sum);

    }

    private static int getElementsSum(int[][] intArray) {
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                count += intArray[i][j];
            }
        }
        return count;
    }

    private static int[][] getArr(Scanner scanner, int row, int colum) {
        int[][] intArr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            intArr[i] = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return intArr;
    }
}
