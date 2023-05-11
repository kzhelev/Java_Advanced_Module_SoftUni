package DefiningClasses.CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        String[] carInfoInput = scanner.nextLine().split("\\s+");

        for (int i = 0; i < numberOfCars; i++) {

            if (carInfoInput.length == 1) {
                carList.add(new Car(carInfoInput[0]));
            } else {
                carList.add(new Car(carInfoInput[0], carInfoInput[1], Integer.parseInt(carInfoInput[2])));
            }
            carInfoInput = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).carInfo());
        }
    }
}
