package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] parameters = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = parameters[0];
        int colons = parameters[1];

        int[][] inputArr = new int[row][colons];

        for (int i = 0; i < row; i++) {
            inputArr[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int toFind = Integer.parseInt(scanner.nextLine());
        boolean found = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colons; j++) {
                if (inputArr[i][j] == toFind) {
                    found = true;
                    System.out.println(i+" "+j);
                }
            }
        }

        if (!found){
            System.out.println("not found");
        }
    }
}
