package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class SecondExc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndColumns[0];
        int columns = rowsAndColumns[1];

        String[][] field = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            field[i] = scanner.nextLine().split("");
        }

        int currentMouseRow = 0;
        int currentMouseColumn = 0;

        int cheesesNumber = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (field[i][j].equals("M")) {
                    currentMouseRow = i;
                    currentMouseColumn = j;
                }
                if (field[i][j].equals("C")) {
                    cheesesNumber++;
                }
            }
        }

        field[currentMouseRow][currentMouseColumn] = "*";

        int cheeseEaten = 0;

        boolean isOutOfTheField = false;

        String command = scanner.nextLine();

        while (!command.equals("danger")) {

            switch (command) {

                case "up":
                    if (currentMouseRow - 1 < 0) {
                        System.out.println("No more cheese for tonight!");
                        isOutOfTheField = true;
                    } else {
                        if (field[currentMouseRow - 1][currentMouseColumn].equals("@")) {
                            //ignored
                        } else {
                            currentMouseRow--;
                        }
                    }
                    break;
                case "down":
                    if (currentMouseRow + 1 > rows-1) {
                        System.out.println("No more cheese for tonight!");
                        isOutOfTheField = true;
                    } else {
                        if (field[currentMouseRow + 1][currentMouseColumn].equals("@")) {
                            //ignored
                        } else {
                            currentMouseRow++;
                        }
                    }
                    break;
                case "right":
                    if (currentMouseColumn + 1 > columns-1) {
                        System.out.println("No more cheese for tonight!");
                        isOutOfTheField = true;
                    } else {
                        if (field[currentMouseRow][currentMouseColumn + 1].equals("@")) {
                            //ignored
                        } else {
                            currentMouseColumn++;
                        }
                    }
                    break;
                case "left":
                    if (currentMouseColumn - 1 < 0) {
                        System.out.println("No more cheese for tonight!");
                        isOutOfTheField = true;
                    } else {
                        if (field[currentMouseRow][currentMouseColumn - 1].equals("@")) {
                            //ignored
                        } else {
                            currentMouseColumn--;
                        }
                    }
                    break;
            }

            if (isOutOfTheField) {
                break;
            }

            if (field[currentMouseRow][currentMouseColumn].equals("C")) {
                cheeseEaten++;
                field[currentMouseRow][currentMouseColumn] = "*";
                cheesesNumber--;
            }

            if (cheesesNumber == 0) {
                System.out.println("Happy mouse! All the cheese is eaten, good night!");
                break;
            }

            if (field[currentMouseRow][currentMouseColumn].equals("T")) {
                System.out.println("Mouse is trapped!");
                break;
            }

            command = scanner.nextLine();

            if (command.equals("danger")) {
                System.out.println("Mouse will come back later!");
            }
        }

        field[currentMouseRow][currentMouseColumn] = "M";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

    }
}
