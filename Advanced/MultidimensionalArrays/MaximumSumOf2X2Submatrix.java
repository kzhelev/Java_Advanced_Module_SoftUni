package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstLine = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = firstLine[0];
        int colum = firstLine[1];

        int[][] intArray = getArr(scanner, row, colum);

        int[][] subMatrix = new int[2][2];
        int sum;
        int maxSum = Integer.MIN_VALUE;

        int[][] theSubMatrixWithBiggestSum = new int[2][2];

        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < colum-1; j++) {
                subMatrix[0][0] = intArray[i][j];
                subMatrix[0][1] = intArray[i][j+1];
                subMatrix[1][0] = intArray[i+1][j];
                subMatrix[1][1] = intArray[i+1][j+1];
                sum = getElementsSum(subMatrix);
                if (sum > maxSum) {
                    maxSum = sum;
                    sum = 0;
                    theSubMatrixWithBiggestSum[0][0] = intArray[i][j];
                    theSubMatrixWithBiggestSum[0][1] = intArray[i][j+1];
                    theSubMatrixWithBiggestSum[1][0] = intArray[i+1][j];
                    theSubMatrixWithBiggestSum[1][1] = intArray[i+1][j+1];
                }
            }
        }

        for (int i = 0; i < theSubMatrixWithBiggestSum.length; i++) {
            for (int j = 0; j < theSubMatrixWithBiggestSum[i].length; j++) {
                System.out.print(theSubMatrixWithBiggestSum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(maxSum);


    }

    private static int[][] getArr(Scanner scanner, int row, int colum) {
        int[][] intArr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            intArr[i] = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return intArr;
    }

    private static int getElementsSum(int[][] subMatrix) {
        int count = 0;
        for (int i = 0; i < subMatrix.length; i++) {
            for (int j = 0; j < subMatrix[i].length; j++) {
                count += subMatrix[i][j];
            }
        }
        return count;
    }
}
