package MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndColumns = Integer.parseInt(scanner.nextLine());

        int[][] intArray = getArr(scanner,rowsAndColumns);

        int diagonalOneSum = 0;
        int diagonalTwoSum = 0;

        for (int i = 0; i < intArray.length; i++) {
            diagonalOneSum += intArray[i][i];
        }
        int counter = 0;
        for (int i = intArray.length-1; i >= 0 ; i--) {
            diagonalTwoSum += intArray[counter][i];
            counter++;
        }

        System.out.println(Math.abs(diagonalOneSum-diagonalTwoSum));

    }

    private static int[][] getArr(Scanner scanner, int rowsAndColumns) {
        int[][] intArr = new int[rowsAndColumns][];
        for (int i = 0; i < rowsAndColumns; i++) {
            intArr[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return intArr;
    }
}
