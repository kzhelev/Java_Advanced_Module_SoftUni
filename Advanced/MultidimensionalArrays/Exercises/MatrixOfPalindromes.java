package MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] parameters = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = parameters[0];
        int columns = parameters[1];

        String[][] array = new String[rows][columns];

        StringBuilder content = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                char charI = (char) i;
                char charJ = (char) j;
                char r = (char) (97+i);
                char c = (char) (r+j);
                array[i][j] = content.append(r).append(c).append(r).toString();
                System.out.print(array[i][j]+" ");
                content.delete(0,6);
            }
            System.out.println();
        }

    }
}
