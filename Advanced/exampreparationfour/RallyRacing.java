package exampreparationfour;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        String racingNumber = scanner.nextLine();

        String[][] field = new String[fieldSize][fieldSize];

        for (int i = 0; i < fieldSize; i++) {

            field[i] = scanner.nextLine().split("\\s+");
        }

        int currentCarRow = 0;
        int currentCarColumn = 0;

        int tunnelEntryRow = 0;
        int tunnelEntryColumn = 0;
        int tunnelExitRow = 0;
        int tunnelExitColumn = 0;
        int finishRow = 0;
        int finishColumn = 0;

        int kilometers = 0;

        boolean tunnelFound = false;

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {

                if(field[i][j].equals("T") && !tunnelFound) {
                    tunnelEntryRow = i;
                    tunnelEntryColumn = j;
                    tunnelFound = true;
                } else if (field[i][j].equals("T") && tunnelFound){
                    tunnelExitRow = i;
                    tunnelExitColumn = j;
                }

                if (field[i][j].equals("F")) {
                    finishRow = i;
                    finishColumn = j;
                }
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            switch (command) {
                case "up":
                    if (currentCarRow - 1 >= 0) {
                        currentCarRow--;
                        if (field[currentCarRow][currentCarColumn].equals("T")) {
                            kilometers += 30;
                            field[tunnelEntryRow][tunnelEntryColumn] = ".";
                            field[tunnelExitRow][tunnelExitColumn] = ".";
                            currentCarRow = tunnelExitRow;
                            currentCarColumn = tunnelExitColumn;
                        } else {
                            kilometers += 10;
                        }
                    }
                    break;
                case "down":
                    if (currentCarRow + 1 <= fieldSize-1) {
                        currentCarRow++;
                        if (field[currentCarRow][currentCarColumn].equals("T")) {
                            kilometers += 30;
                            field[tunnelEntryRow][tunnelEntryColumn] = ".";
                            field[tunnelExitRow][tunnelExitColumn] = ".";
                            currentCarRow = tunnelExitRow;
                            currentCarColumn = tunnelExitColumn;
                        } else {
                            kilometers += 10;
                        }
                    }
                    break;
                case "left":
                    if (currentCarColumn - 1 >= 0) {
                        currentCarColumn--;
                        if (field[currentCarRow][currentCarColumn].equals("T")) {
                            kilometers += 30;
                            field[tunnelEntryRow][tunnelEntryColumn] = ".";
                            field[tunnelExitRow][tunnelExitColumn] = ".";
                            currentCarRow = tunnelExitRow;
                            currentCarColumn = tunnelExitColumn;
                        } else {
                            kilometers += 10;
                        }
                    }
                    break;
                case "right":
                    if (currentCarColumn + 1 <= fieldSize-1) {
                        currentCarColumn++;
                        if (field[currentCarRow][currentCarColumn].equals("T")) {
                            kilometers += 30;
                            field[tunnelEntryRow][tunnelEntryColumn] = ".";
                            field[tunnelExitRow][tunnelExitColumn] = ".";
                            currentCarRow = tunnelExitRow;
                            currentCarColumn = tunnelExitColumn;
                        } else {
                            kilometers += 10;
                        }
                    }
                    break;
            }

            if (field[currentCarRow][currentCarColumn].equals("F")) {
                field[currentCarRow][currentCarColumn] = "C";
                System.out.printf("Racing car %s finished the stage!\n", racingNumber);
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("End")) {
            field[currentCarRow][currentCarColumn] = "C";
            System.out.printf("Racing car %s DNF.\n",racingNumber);
        }

        System.out.printf("Distance covered %d km.\n",kilometers);

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
