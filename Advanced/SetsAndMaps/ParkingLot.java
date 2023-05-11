package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(",\\s+");

        Set<String> carNumbers = new LinkedHashSet<>();

        while (!command[0].equals("END")) {

            switch (command[0]) {
                case "IN":
                    carNumbers.add(command[1]);
                    break;
                case "OUT":
                    carNumbers.remove(command[1]);
                    break;
            }

            command = scanner.nextLine().split(",\\s+");

        }
        if (carNumbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : carNumbers) {
                System.out.println(carNumber);
            }
        }
    }
}
