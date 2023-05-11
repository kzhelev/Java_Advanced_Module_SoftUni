package MultidimensionalArrays;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] playGround = getCharArr(scanner);

        boolean isTheRealQueen = false;

        for (int i = 0; i < playGround.length; i++) {
            for (int j = 0; j < playGround[i].length; j++) {
                if (playGround[i][j] == 'q') {
                    isTheRealQueen = check(playGround, i, j);
                    if (isTheRealQueen) {
                        System.out.println(i + " " + j);
                        break;
                    }
                }
            }
        }
    }

    private static char[][] getCharArr(Scanner scanner) {
        char[][] charArr = new char[8][];
        for (int i = 0; i < 8; i++) {
            charArr[i] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }
        return charArr;
    }

    private static boolean check(char[][] playGround, int row, int column) {
        int counter = 0;
        int r = row;
        int c = column;
        for (int i = 0; i < playGround.length; i++) {
            if (playGround[i][column] == 'q') {
                counter++;
            }
            if (counter > 1) {
                return false;
            }
        }

        counter = 0;
        for (int i = 0; i < playGround.length; i++) {
            if (playGround[row][i] == 'q') {
                counter++;
            }
            if (counter > 1) {
                return false;
            }
        }

        counter = 0;
        while (row >= 0 && column < 8) {
            if (playGround[row][column] == 'q') {
                counter++;
            }
            if (counter > 1) {
                return false;
            }
            row --;
            column ++;
        }

        counter = 0;
        row = r;
        column = c;
        while (row < 8 && column >= 0) {
            if (playGround[row][column] == 'q') {
                counter++;
            }
            if (counter > 1) {
                return false;
            }

            row ++;
            column --;
        }

        counter = 0;
        row = r;
        column = c;
        while (row >= 0 && column >= 0) {
            if (playGround[row][column] == 'q') {
                counter++;
            }
            if (counter > 1) {
                return false;
            }
            row --;
            column --;
        }

        counter = 0;
        row = r;
        column = c;
        while (row < 8 && column < 8) {

            if (playGround[row][column] == 'q') {
                counter++;
            }
            if (counter > 1) {
                return false;
            }

            row ++;
            column ++;
        }

        return true;

    }

}
