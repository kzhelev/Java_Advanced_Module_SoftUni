package Encapsulation.ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Double length = Double.parseDouble(scanner.nextLine());
        Double width = Double.parseDouble(scanner.nextLine());
        Double height = Double.parseDouble(scanner.nextLine());

        Box box = null;

        try {
            box = new Box(length,width,height);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.printf("%.2f%n",box.calculateSurfaceArea());
        System.out.printf("%.2f%n",box.calculateLateralSurfaceArea());
        System.out.printf("%.2f%n",box.calculateVolume());

    }
}
