package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsAndColumns = Integer.parseInt(scanner.nextLine());

        int[][] array = getArr(scanner,rowsAndColumns);

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][i] + " ");
                break;
            }
        }
        System.out.println();
        int counter = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][counter] + " ");
                break;
            }
            counter++;
        }

    }

    private static int[][] getArr(Scanner scanner, int rowsAndColumns) {
        int[][] intArr = new int[rowsAndColumns][rowsAndColumns];
        for (int i = 0; i < rowsAndColumns; i++) {
            intArr[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return intArr;
    }
}
