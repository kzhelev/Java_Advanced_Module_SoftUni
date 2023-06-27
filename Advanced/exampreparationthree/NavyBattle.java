package exampreparationthree;

import java.util.Arrays;
import java.util.Scanner;

public class NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        String[][] field = new String[fieldSize][fieldSize];

        for (int i = 0; i < fieldSize; i++) {

            field[i] = scanner.nextLine().split("");
        }

        int currentRowPosition = 0;
        int currentColumnPosition = 0;
        int enemies = 0;

        for (int i = 0; i < fieldSize; i++) {

            for (int j = 0; j < fieldSize; j++) {

                if (field[i][j].equals("S")) {
                    currentRowPosition = i;
                    currentColumnPosition = j;
                }

                if (field[i][j].equals("C")) {
                    enemies++;
                }
            }
        }

        int shipHealth = 3;

        String command = scanner.nextLine();

        while (true) {

            switch (command) {

                case "up":
                    if (currentRowPosition - 1 >= 0) {
                        field[currentRowPosition][currentColumnPosition] = "-";
                        currentRowPosition--;
                    }

                    shipHealth = getShipHealth(field, currentRowPosition, currentColumnPosition, shipHealth);

                    enemies = enemiesLeft(field, currentRowPosition, currentColumnPosition, "C", enemies);

                    field[currentRowPosition][currentColumnPosition] = "S";
                    break;
                case "down":
                    if (currentRowPosition + 1 <= fieldSize - 1) {
                        field[currentRowPosition][currentColumnPosition] = "-";
                        currentRowPosition++;
                    }

                    shipHealth = getShipHealth(field, currentRowPosition, currentColumnPosition, shipHealth);

                    enemies = enemiesLeft(field, currentRowPosition, currentColumnPosition, "C", enemies);

                    field[currentRowPosition][currentColumnPosition] = "S";
                    break;
                case "left":
                    if (currentColumnPosition - 1 >= 0) {
                        field[currentRowPosition][currentColumnPosition] = "-";
                        currentColumnPosition--;
                    }

                    shipHealth = getShipHealth(field, currentRowPosition, currentColumnPosition, shipHealth);

                    enemies = enemiesLeft(field, currentRowPosition, currentColumnPosition, "C", enemies);

                    field[currentRowPosition][currentColumnPosition] = "S";
                    break;
                case "right":
                    if (currentColumnPosition + 1 <= fieldSize - 1) {
                        field[currentRowPosition][currentColumnPosition] = "-";
                        currentColumnPosition++;
                    }

                    shipHealth = getShipHealth(field, currentRowPosition, currentColumnPosition, shipHealth);

                    enemies = enemiesLeft(field, currentRowPosition, currentColumnPosition, "C", enemies);

                    field[currentRowPosition][currentColumnPosition] = "S";
                    break;
            }

            if (shipHealth == 0) {
                System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!\n", currentRowPosition, currentColumnPosition);
                break;
            }

            if (enemies == 0) {
                System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    private static int enemiesLeft(String[][] field, int currentRowPosition, int currentColumnPosition, String C, int enemies) {
        if (field[currentRowPosition][currentColumnPosition].equals(C)) {
            field[currentRowPosition][currentColumnPosition] = "-";
            enemies--;
        }
        return enemies;
    }

    private static int getShipHealth(String[][] field, int currentRowPosition, int currentColumnPosition, int shipHealth) {
        if (field[currentRowPosition][currentColumnPosition].equals("*")) {
            field[currentRowPosition][currentColumnPosition] = "-";
            shipHealth--;
        }
        return shipHealth;
    }
}
