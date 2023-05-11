package Polymorphism.Vehicles;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String[] carInfo = scanner.nextLine().split("\\s+");
        vehicles.add(new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Integer.parseInt(carInfo[3])));
        carInfo = scanner.nextLine().split("\\s+");
        vehicles.add(new Truck(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Integer.parseInt(carInfo[3])));
        carInfo = scanner.nextLine().split("\\s+");
        vehicles.add(new Bus(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Integer.parseInt(carInfo[3])));

        int loops = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < loops; i++) {
            carInfo = scanner.nextLine().split("\\s+");

            switch (String.format("%s %s", carInfo[0], carInfo[1])) {
                case "Drive Car":
                    vehicles.get(0).drive(Double.parseDouble(carInfo[2]));
                    break;
                case "Drive Truck":
                    vehicles.get(1).drive(Double.parseDouble(carInfo[2]));
                    break;
                case "DriveEmpty Bus":

                    //The default consumption is when the bus is full;

                    Bus bus = (Bus) vehicles.get(2);

                    //Change the default consumption;
                    bus.setEmptyBusConsumption();
                    vehicles.get(2).drive(Double.parseDouble(carInfo[2]));

                    //Change back to default consumption;
                    bus.setFullBusConsumption();
                    break;
                case "Drive Bus":
                    vehicles.get(2).drive(Double.parseDouble(carInfo[2]));
                    break;
                case "Refuel Car":
                    try {
                        vehicles.get(0).refuel(Double.parseDouble(carInfo[2]));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Refuel Truck":
                    try {
                        vehicles.get(1).refuel(Double.parseDouble(carInfo[2]));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Refuel Bus":
                    try {
                        vehicles.get(2).refuel(Double.parseDouble(carInfo[2]));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }

        vehicles.forEach(System.out::println);

    }
}
