package Abstraction.JediGalaxyFirstAttempt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = parseToArray(scanner.nextLine());

        Galaxy galaxy = new Galaxy(dimensions[0], dimensions[1]);

        String command = scanner.nextLine();

        long sum = 0;

        while (!command.equals("Let the Force be with you")) {

            int[] jedisCoordinates = parseToArray(command);
            int[] evilCoordinates = parseToArray(scanner.nextLine());


                galaxy.moveEvil(evilCoordinates[1], evilCoordinates[0]);

                sum = galaxy.moveJedi(sum, jedisCoordinates[1], jedisCoordinates[0]);

            command = scanner.nextLine();
        }

        System.out.println(sum);
    }

    private static boolean coordinatesInRange(int galaxyX, int galaxyY, int coordinateX, int coordinateY) {
        return coordinateX >= 0 && coordinateX <= galaxyX && coordinateY >= 0 && coordinateY <= galaxyY;
    }

    private static int[] parseToArray(String scanner) {
        return Arrays.stream(scanner.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
