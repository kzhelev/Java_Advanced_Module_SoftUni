package DefiningClasses.Exercises.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carNumbers = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        String[] carInfo;
        String carModel;
        double fuelAmount;
        double fuelCostPerKm;

        for (int i = 0; i < carNumbers; i++) {

            carInfo = scanner.nextLine().split("\\s+");
            carModel = carInfo[0];
            fuelAmount = Double.parseDouble(carInfo[1]);
            fuelCostPerKm = Double.parseDouble(carInfo[2]);

            cars.put(carModel,new Car(carModel,fuelAmount,fuelCostPerKm));
        }

        String input = scanner.nextLine();
        double distanceToTravel;

        while (!input.equals("End")) {

            String[] command = input.split("\\s+");

            carModel = command[1];
            distanceToTravel = Double.parseDouble(command[2]);

            switch (command[0]) {
 
                case "Drive":
                    cars.get(carModel).driveCar(cars, carModel, distanceToTravel);
                    break;

                default:throw new IllegalArgumentException("Unknown command: " + command[0]);
            }

            input = scanner.nextLine();
        }

        cars.entrySet().stream().forEach(e -> System.out.println(e.getValue().toString()));
    }
}
