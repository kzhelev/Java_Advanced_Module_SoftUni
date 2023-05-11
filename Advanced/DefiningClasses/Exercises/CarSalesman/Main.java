package DefiningClasses.Exercises.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enginesNumber = Integer.parseInt(scanner.nextLine());

        Map<String, EngineI> enginesList = new HashMap<>();

        String[] enginInfo;

        for (int i = 0; i < enginesNumber; i++) {
            enginInfo = scanner.nextLine().split(" ");

            if (enginInfo.length == 2) {
                enginesList.put(enginInfo[0], new EngineI(enginInfo[0], Integer.parseInt(enginInfo[1])));
            } else if (enginInfo.length == 3) {
                if (enginInfo[2].matches("[A-F][+]*")) {
                    enginesList.put(enginInfo[0], new EngineI(enginInfo[0], Integer.parseInt(enginInfo[1]), enginInfo[2]));
                } else {
                    enginesList.put(enginInfo[0], new EngineI(enginInfo[0], Integer.parseInt(enginInfo[1]), Integer.parseInt(enginInfo[2])));
                }
            } else {
                enginesList.put(enginInfo[0], new EngineI(enginInfo[0], Integer.parseInt(enginInfo[1]), Integer.parseInt(enginInfo[2]), enginInfo[3]));
            }
        }

        int carsNumber = Integer.parseInt(scanner.nextLine());

        Set<CarI> carsList = new LinkedHashSet<>();

        String[] carInfo;

        for (int i = 0; i < carsNumber; i++) {
            carInfo = scanner.nextLine().split(" ");

            if (carInfo.length == 2) {
                carsList.add(new CarI(carInfo[0], enginesList.get(carInfo[1])));
            } else if (carInfo.length == 3) {
                if (carInfo[2].matches("[0-9]+") ) {
                    carsList.add(new CarI(carInfo[0], enginesList.get(carInfo[1]), Double.parseDouble(carInfo[2])));
                } else {
                    carsList.add(new CarI(carInfo[0], enginesList.get(carInfo[1]), carInfo[2]));
                }
            } else {
                carsList.add(new CarI(carInfo[0], enginesList.get(carInfo[1]), Double.parseDouble(carInfo[2]), carInfo[3]));
            }
        }

        carsList.forEach(CarI::printCarsInfo);
    }
}
