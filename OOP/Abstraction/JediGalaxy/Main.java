package Abstraction.JediGalaxy;

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

            int[] ivoS = parseToArray(command);
            int[] evil = parseToArray(scanner.nextLine());

            int evilCoordinateX = evil[0];
            int evilCoordinateY = evil[1];

            galaxy.moveEvil(evilCoordinateX,evilCoordinateY);

            int jedisCoordinateX = ivoS[0];
            int jedisCoordinateY = ivoS[1];

            sum = galaxy.moveJedi(sum,jedisCoordinateX,jedisCoordinateY);

            command = scanner.nextLine();
        }

        System.out.println(sum);
    }


    private static int[] parseToArray(String scanner) {
        return Arrays.stream(scanner.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
