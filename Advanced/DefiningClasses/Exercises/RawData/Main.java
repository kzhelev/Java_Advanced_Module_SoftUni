package DefiningClasses.Exercises.RawData;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carNumbers = Integer.parseInt(scanner.nextLine());

        Set<Car> carsList = new LinkedHashSet<>();

        String[] carInfo;

        for (int i = 0; i < carNumbers; i++) {
            carInfo = scanner.nextLine().split(" ");
            carsList.add(new Car(carInfo[0], Integer.parseInt(carInfo[1]), Integer.parseInt(carInfo[2]), Integer.parseInt(carInfo[3]),
                    carInfo[4], Double.parseDouble(carInfo[5]), Integer.parseInt(carInfo[6]), Double.parseDouble(carInfo[7]),
                    Integer.parseInt(carInfo[8]), Double.parseDouble(carInfo[9]), Integer.parseInt(carInfo[10]),
                    Double.parseDouble(carInfo[9]), Integer.parseInt(carInfo[10])));
            if (i == carNumbers-1) {
                for (Car car : carsList) {
                    car.setAverageTiresPressure();
                }

            }
        }

        String cargoType = scanner.nextLine();

        if (cargoType.equals("fragile")) {
            carsList.stream().filter(e -> e.getCargo().getType().equals(cargoType)).filter(e -> e.getAverageTiresPressure() < 1)
                    .forEach(e -> System.out.println(e.getModel()));
        } else if (cargoType.equals("flamable")) {
            carsList.stream().filter(e -> e.getCargo().getType().equals(cargoType)).filter(e -> e.getEngine().getPower() > 250)
                    .forEach(e -> System.out.println(e.getModel()));
        }
    }
}
