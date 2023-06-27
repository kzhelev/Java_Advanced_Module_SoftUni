package exampreparationtwo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] fieldParameters = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = fieldParameters[0];
        int columns = fieldParameters[1];

        String[][] field = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            String input = scanner.nextLine();
            field[i] = input.split("\\s+");
        }

        int currentPositionRow = 0;
        int currentPositionColumn = 0;
        int players = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("B")) {
                    currentPositionRow = i;
                    currentPositionColumn = j;
                }
                if (field[i][j].equals("P")) {
                    players++;
                }
            }
        }

        String command = scanner.nextLine();

        int touches = 0;
        int moves = 0;

        while (!command.equals("Finish")) {

            switch (command) {
                case "up":
                    if (currentPositionRow - 1 >= 0 && !field[currentPositionRow - 1][currentPositionColumn].equals("O") ) {
                        currentPositionRow--;
                        moves++;
                        if (field[currentPositionRow][currentPositionColumn].equals("P")){
                            touches++;
                            players--;
                            field[currentPositionRow][currentPositionColumn] = "-";
                        }
                    }
                    break;
                case "down":
                    if (currentPositionRow + 1 <= rows-1 && !field[currentPositionRow + 1][currentPositionColumn].equals("O") ) {
                        currentPositionRow++;
                        moves++;
                        if (field[currentPositionRow][currentPositionColumn].equals("P")){
                            touches++;
                            players--;
                            field[currentPositionRow][currentPositionColumn] = "-";
                        }
                    }
                    break;
                case "right":
                    if (currentPositionColumn + 1 <= columns-1 && !field[currentPositionRow][currentPositionColumn + 1].equals("O") ) {
                        currentPositionColumn++;
                        moves++;
                        if (field[currentPositionRow][currentPositionColumn].equals("P")){
                            touches++;
                            players--;
                            field[currentPositionRow][currentPositionColumn] = "-";
                        }
                    }
                    break;
                case "left":
                    if (currentPositionColumn - 1 >= 0 && !field[currentPositionRow][currentPositionColumn - 1].equals("O") ) {
                        currentPositionColumn--;
                        moves++;
                        if (field[currentPositionRow][currentPositionColumn].equals("P")){
                            touches++;
                            players--;
                            field[currentPositionRow][currentPositionColumn] = "-";
                        }
                    }
                    break;
            }

            if (players == 0) {
                break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Game over!\nTouched opponents: %d Moves made: %d",touches,moves);
    }
}
