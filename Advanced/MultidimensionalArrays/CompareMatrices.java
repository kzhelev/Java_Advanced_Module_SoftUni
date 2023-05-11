package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstArr = getIntsArr(scanner);
        
        int[][] secondArr = getIntsArr(scanner);

        if (Arrays.deepEquals(firstArr, secondArr)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static int[][] getIntsArr(Scanner scanner) {
        int[] firstLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = firstLine[0];
        int colum = firstLine[1];

        int[][] intArr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            intArr[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return intArr;
    }
}
