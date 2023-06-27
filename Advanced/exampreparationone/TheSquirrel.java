package exampreparationone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheSquirrel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fieldLength = Integer.parseInt(scanner.nextLine());

        String[][] field = new String[5][5];

        List<String> move = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int hazelnut = 0;

        for (int i = 0; i < fieldLength; i++) {

            String[] fieldInfo = scanner.next().split("");
            field[i] = fieldInfo;
        }

        int startingRow = 0;
        int startingColumn = 0;

        for (int row = 0; row < fieldLength; row++) {

            for (int column = 0; column < fieldLength; column++) {

                if (field[row][column].equals("s")) {

                    startingRow = row;
                    startingColumn = column;
                }
            }
        }

        boolean loose = false;

        for (int i = 0; i < move.size(); i++) {

            switch (move.get(i)) {

                case "left":
                    startingColumn--;
                    break;
                case "right":
                    startingColumn++;
                    break;
                case "up":
                    startingRow--;
                    break;
                case "down":
                    startingRow++;
                    break;
            }

            if (startingColumn > fieldLength-1 || startingColumn < 0 || startingRow > fieldLength - 1 || startingRow < 0) {
                System.out.println("The squirrel is out of the field.");
                loose = true;
                break;
            }

            if (field[startingRow][startingColumn].equals("t")) {
                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                loose = true;
                break;
            }

            if (field[startingRow][startingColumn].equals("h")) {
                hazelnut++;
                if (hazelnut == 3) {
                    break;
                }
                field[startingRow][startingColumn] = "*";
            }
        }

        if (hazelnut == 3 && !loose) {
            System.out.println("Good job! You have collected all hazelnuts!");
        } else if (hazelnut != 3 && !loose) {
            System.out.println("There are more hazelnuts to collect.");
        }

        System.out.printf("Hazelnuts collected: %d",hazelnut);
    }
}
