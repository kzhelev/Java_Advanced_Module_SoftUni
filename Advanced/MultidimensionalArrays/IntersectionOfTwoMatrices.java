package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int colons = Integer.parseInt(scanner.nextLine());

        char[][] arrayA = fillUpTheArray(row,colons,scanner);

        char[][] arrayB = fillUpTheArray(row,colons,scanner);

        char[][] arrayC = new char[row][colons];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                arrayC[i][j] = arrayA[i][j] == arrayB[i][j] ? arrayA[i][j] : '*';
            }
        }
        printArr(arrayC);


    }

    public static void printArr(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static char[][] fillUpTheArray(int row,int colons, Scanner scanner) {
        char[][] array = new char[row][colons];
        for (int i = 0; i < row; i++) {
            array[i] = scanner.nextLine().replaceAll(" ","").toCharArray();
        }
        return array;
    }
}
