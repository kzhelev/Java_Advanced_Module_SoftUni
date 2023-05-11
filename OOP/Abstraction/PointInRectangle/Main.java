package Abstraction.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectanglePoints = parseToArray(scanner);

        Rectangle rectangle = new Rectangle(new Point(rectanglePoints[0],rectanglePoints[1])
                , new Point(rectanglePoints[2], rectanglePoints[3]));

        int loops = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < loops; i++) {
            int[] pointCoordinates = parseToArray(scanner);
            System.out.println(rectangle.contains(new Point(pointCoordinates[0], pointCoordinates[1])));
        }

    }

    private static int[] parseToArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
