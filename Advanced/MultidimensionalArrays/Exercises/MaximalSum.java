package MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = rowsAndColumns[0];
        int columns = rowsAndColumns[1];

        int[][] array = getArr(scanner,row,columns);

        getNearbyMaxSum(array);
    }

    private static void getNearbyMaxSum(int[][] array) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[][] maxSumMatrix = new int[3][3];

        for (int i = 0; i < array.length-2; i++) {
            for (int j = 0; j < array[i].length-2; j++) {
                sum = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j] + array[i+1][j+1] + array[i+1][j+2]
                        + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                if (sum > maxSum) {
                    maxSum = sum;
                    for (int k = 0; k < maxSumMatrix.length; k++) {
                        for (int l = 0; l < maxSumMatrix[k].length; l++) {
                            maxSumMatrix[k][l] =  array[k+i][l+j];
                        }
                    }
                }
            }
        }
        System.out.println("Sum = "+maxSum);

        for (int i = 0; i < maxSumMatrix.length; i++) {
            for (int j = 0; j < maxSumMatrix[i].length; j++) {
                    System.out.print(j != maxSumMatrix[i].length-1 ? maxSumMatrix[i][j] + " " : maxSumMatrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] getArr(Scanner scanner, int row, int colum) {
        int[][] intArr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            intArr[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return intArr;
    }
}
